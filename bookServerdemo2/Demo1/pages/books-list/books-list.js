// pages/books-list/books-list.js
Page({

  /**
   * 页面的初始数据
   */
  data: {
    books: {}
  },

  /**
   * 生命周期函数--监听页面加载
   */
  onLoad: function (options) {
    var classifyOne = options.classifyone;
    var that = this;
    wx.showNavigationBarLoading();
    wx.request({
      url: getApp().globalData.url + 'api-book-book-byclassifyone/' + classifyOne,
      data: {},
      method: 'GET',
      success: function(res){
        that.setData({books: res.data});
        console.log(res.data);
      }
    })
    wx.hideNavigationBarLoading();
  },
  bookDetailBtn: function (event) {
    var bookId = event.currentTarget.id;
    wx.navigateTo({
      url: '/pages/book-detail/book-detail?scanCode=0&id=' + bookId
    })
  }
})