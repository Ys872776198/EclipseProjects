// // pages/register/register.js
// Page({

//   /**
//    * 页面的初始数据
//    */
//   data: {
//     errorStatus: 0
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
//   formSubmit: function (e) {
//     // 在调试界面显示用户输入的数据
//     console.log('registerMsg: ', e.detail.value);
//     let username = e.detail.value.username;
//     let password = e.detail.value.password;
//     let password2 = e.detail.value.password2;
//     //执行注册
//     wx.request({
//       url: getApp().globalData.url + 'api-user-register',
//       data: { 
//         username: username, 
//         password: password,
//         password2: password2 
//       },
//       method: 'GET',
//       success: function (res) {
//         if (res.data == 1) {
//           //注册成功
//           wx.redirectTo({
//             url: '/pages/login/login'
//           })
//         } else {
//           //注册失败
//           wx.redirectTo({
//             url: '/pages/register/register?errorStatus=1'
//           })
//         }
//       }
//     });
//   },
//   navBtnOnClick: () => {
//     wx.redirectTo({
//       url: '/pages/login/login'
//     })
//   }

// })
// pages/register/register.js
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
  formSubmit: function (e) {
    console.log('registerMsg: ', e.detail.value);
    let username = e.detail.value.username;
    let password = e.detail.value.password;
    let password2 = e.detail.value.password2;
    //执行注册
    wx.request({
      url: getApp().globalData.url + 'api-user-register',
      data: { username: username, password: password, password2: password2 },
      method: 'GET',
      success: function (res) {
        if (res.data == 1) {
          //注册成功
          wx.redirectTo({
            url: '/pages/login/login'
          })
        } else {
          //注册失败
          wx.redirectTo({
            url: '/pages/register/register?errorStatus=1'
          })
        }
      }
    });
  },
  navBtnOnClick: () => {
    wx.redirectTo({
      url: '/pages/login/login'
    })
  }
})