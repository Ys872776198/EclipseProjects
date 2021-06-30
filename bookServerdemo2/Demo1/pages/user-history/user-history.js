// pages/user-history/user-history.js
Page({

  /**
   * 页面的初始数据
   */
  data: {
    history: {}
  },

  /**
   * 生命周期函数--监听页面加载
   */
  onLoad: function (options) {
    var that = this;
    var userId = getApp().globalData.user.userId;
    wx.request({
      url: getApp().globalData.url + 'api-scan-borrow-history/' + userId,
      data: {},
      method: 'GET',
      success: function (res) {
        var data = res.data;
        that.setData({history: data});
        console.log(data);
      }
    })
  },
  
  bookDetailBtn: function (event) {
    var bookId = event.currentTarget.id;
    wx.navigateTo({
      url: '/pages/book-detail/book-detail?scanCode=0&id=' + bookId
    })
  }
  

})