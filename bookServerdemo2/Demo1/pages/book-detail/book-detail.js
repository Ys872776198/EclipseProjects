// pages/book-detail/book-detail.js
Page({

  /**
   * 页面的初始数据
   */
  data: {
    // scanCode: 0,
    book: {},
    bookRecommend: {}
  },

  /**
   * 生命周期函数--监听页面加载
   */
  onLoad: function (options) {
    var that = this;
    // if (options.scanCode == 1) {
    //   this.setData({ scanCode: 1 });
    // }
    let bookId = options.id;
    wx.request({
      url: getApp().globalData.url + "api-book-book-byid/" + bookId,
      data: {},
      method: 'GET',
      success: function (res) {
        that.setData({ book: res.data });
      }
    })
    wx.request({
      url: getApp().globalData.url + "api-record-browse/" + getApp().globalData.user.userId + "/" + bookId,
      data: {},
      method: 'GET',
      success: function (res) {

      }
    })
    wx.request({
      url: getApp().globalData.url + "api-book-recommend/" + bookId,
      data: {},
      method: 'GET',
      success: function (res) {
        that.setData({ bookRecommend: res.data });
      }
    })
  },

  readBtn: function (event) {
    var bookId = event.currentTarget.id;
    wx.showModal({
      title: '请问您是否阅读本书',
      confirmColor: '#4db6ac',
      success: function (res) {
        if (res.confirm) {
          wx.navigateTo({
            url: '/pages/book-read/book-read',
          })
        } else if (res.cancel) {

        }
      }
    })
  },

  // exitBtn:() =>{
  //   wx.redirectTo({
  //     url: '/pages/books-search/books-search',
  //   })
  // },

  bookDetailBtn: function (event) {
    var bookId = event.currentTarget.id;
    wx.redirectTo({
      url: '/pages/book-detail/book-detail?id=' + bookId,
    })
  }
})