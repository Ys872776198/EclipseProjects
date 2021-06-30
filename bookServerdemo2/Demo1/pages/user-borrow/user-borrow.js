// pages/user-borrow/user-borrow.js
Page({

  /**
   * 页面的初始数据
   */
  data: {
    borrowList: 0
  },

  /**
   * 生命周期函数--监听页面加载
   */
  onLoad: function (options) {
    var that = this;
    var userId = getApp().globalData.user.userId;
    wx.request({
      url: getApp().globalData.url + 'api-scan-borrowed-byuserid/' + userId,
      data: {},
      method: 'GET',
      success: function (res) {
        var data = res.data;
        for (var i = 0; i < data.length; ++i) {
          //阅读时间
          data[i].borrowStartTime = new Date(data[i].borrowStartTime);
          var mydate = data[i].borrowStartTime.getFullYear() + "-" + (data[i].borrowStartTime.getMonth() + 1) + "-" + data[i].borrowStartTime.getDate();
          data[i].borrowStartTime = mydate;
        }
        that.setData({borrowList: data});
      }
    })
  }
})