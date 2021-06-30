// pages/book-read/book-read.js
// Page({
//   // exitBtnOnClick:() =>{
//   //   wx.redirectTo({
//   //     url: '/pages/book-detail/book-detail',
//   //   })
//   // }
// })


Page({
  data:{
    codeShow: false,
    progress: true,
    title: "加载中",
    borrowId: 0,
    Aserss: "",
    borrowList: 0
  },
  onLoad:function(options){
    var that = this;
    var userId = getApp().globalData.user.userId;
    var bookId = options.id;
    wx.request({
      url: getApp().globalData.url + 'api-scan-read-book/' + userId + "/" + bookId,
      data: {},
      method: 'GET',    
      success: function (res) {
       // console.log(res)
       that.setData({
         Adress:res.bookAddress
       })
      }
    })
    ,
    wx.getFileSystemManager().copyFile({  //先把文件复制到可操作的文件夹
      srcPath	:  Adress, //源文件
      destPath: wx.env.USER_DATA_PATH +bookId + ".txt",	//可操作的文件夹路径
      success: res => {
           console.log(res)		//复制成功返回res信息
      },
      fail: console.error		//复制失败返回error
    })
    ,
    wx.getFileSystemManager().readFile({  //读取文件
      filePath: wx.env.USER_DATA_PATH +bookId + ".txt",
      encoding: 'utf-8',
      success: res => {
        console.log(res.data)
        // that.setData({
        //   read:res.data
        // })
      }
      ,
      fail: console.error
    })


  }
})