// // pages/login/login.js
// Page({

//   /**
//    * 页面的初始数据
//    */
//   data: {    
//     errorStatus: 0    //判断是否出现页面加载
//   },

//   /**
//    * 生命周期函数--监听页面加载
//    */
//   onLoad: function (options) {
//     let errorStatus = option.errorStatus;
//     if (errorStatus == 1) {
//       this.setData({ errorStatus: 1 });
//     }
//   },
  
//   formSubmit: (e) => {    //E为用户输入数据
//     wx.request({
//       url: getApp().globalData.url + 'api-user-login',    //链接后台管理的数据库
//       data: { 
//         username: e.detail.value.username, 
//         password: e.detail.value.password 
//       },
//       method: 'GET',
//       success: function (res) {
//         if (res.data.userId != null) {
//           console.log(res.data);
//           //登录成功
//           //微信端登录
//           var app = getApp();
//           app.getUserInfo();
//           getApp().globalData.user = res.data;
//           wx.switchTab({
//             url: '/pages/books/books'
//           })
//         } else {
//           //登录失败，会跳转到初始登陆界面
//           wx.redirectTo({
//             url: '/pages/login/login?errorStatus=1'   //需要跳转的应用内非 tabBar 的页面的路径 (代码包路径), 路径后可以带参数。参数与路径之间使用 ? 分隔
//           })
//         }
//       }
//     });
//   },
//   navBtnOnClick: () => {
//     wx.redirectTo({
//       url: '/pages/register/register'
//     })
//   }
  
// })

Page({
  data: {
    errorStatus: 0
  },
  onLoad: function (option) {
    let errorStatus = option.errorStatus;
    if (errorStatus == 1) {
      this.setData({ errorStatus: 1 });
    }
  },
  formSubmit: (e) => {    //E为用户输入数据
    wx.request({
      url: getApp().globalData.url + 'api-user-login',    //链接后台管理的数据库
      data: { 
        username: e.detail.value.username, 
        password: e.detail.value.password 
      },
      method: 'GET',
      success: function (res) {
        if (res.data.userId != null) {
          console.log(res.data);
          //登录成功
          //微信端登录
          var app = getApp();
          app.getUserInfo();
          getApp().globalData.user = res.data;
          wx.switchTab({
            url: '/pages/books/books'
          })
        } else {
          //登录失败，会跳转到初始登陆界面
          wx.redirectTo({
            url: '/pages/login/login?errorStatus=1'   //需要跳转的应用内非 tabBar 的页面的路径 (代码包路径), 路径后可以带参数。参数与路径之间使用 ? 分隔
          })
        }
      }
    });
  },
  navBtnOnClick: () => {
    wx.redirectTo({
      url: '/pages/register/register'
    })
  }
})