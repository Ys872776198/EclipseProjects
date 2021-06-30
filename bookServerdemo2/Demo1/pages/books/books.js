// pages/books/books.js
Page({

  /**
   * 页面的初始数据
   */
  data: {
    specialOn: false,   //特殊按钮打开标志
    hotBookList: {},    //热门书籍列表
    newBookList: {}   //最新书籍列表
  },

  /**
   * 生命周期函数--监听页面加载
   */
  onLoad: function (options) {
    var that = this;
    // 获取热门图书
    wx.request({
      url: getApp().globalData.url + 'api-index-getHotBook',
      data: {},
      method: 'GET',
      success: function (res) {
        that.setData({ hotBookList: res.data });
      }
    })
    // 获取新书
    wx.request({
      url: getApp().globalData.url + 'api-index-getNewBook',
      data: {},
      method: 'GET',
      success: function (res) {
        that.setData({ newBookList: res.data });
      }
    })
  },

  /**
   * 页面相关事件处理函数--监听用户下拉动作
   */
  onPullDownRefresh: function () {
    wx.showNavigationBarLoading();
    var that = this;
    //获取热门图书
    wx.request({
      url: getApp().globalData.url + 'api-index-getHotBook',
      data: {},
      method: 'GET',
      success: function (res) {
        that.setData({ hotBookList: res.data });
      }
    })
    //获取新书
    wx.request({
      url: getApp().globalData.url + 'api-index-getNewBook',
      data: {},
      method: 'GET',
      success: function (res) {
        that.setData({ newBookList: res.data });
      }
    })
    wx.stopPullDownRefresh();   //停止当前页面下拉刷新。
    wx.hideNavigationBarLoading();    //在当前页面隐藏导航条加载动画
  },

  // 点击新书跳转
  bookDetailBtn: function (e) {
    var bookId = e.currentTarget.id;
    wx.navigateTo({
      url: '/pages/book-detail/book-detail?scanCode=0&id=' + bookId
    })
  },
  
  //跳转搜索
  changeInput: function(e) {
    var search = e.detail.value;
    if (search != "") {
      wx.navigateTo({
        url: '/pages/books-search/books-search?search=' + search,
      })
    }
  }
})