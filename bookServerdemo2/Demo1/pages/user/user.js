// pages/user/user.js
Page({
  data: {
    userInfo: {},
    username: ""
  },

  // 页面监听
  onLoad: function (options) {
    var that = this;
    wx.getUserInfo({
      success: function (res) {
        var userInfo = res.userInfo;
        that.setData({ userInfo: userInfo });
      }
    });
    let name = getApp().globalData.user.userUsername;
    that.setData({username: name});
  },

  // 退出登陆
  exitBtnOnClick: function() {
    wx.request({
      url: getApp().globalData.url + 'api-user-exit',
      data: {},
      method: 'GET', 
      success: function(res){
      }
    })
    wx.redirectTo({
      url: '/pages/index/index'
    })
  },

  // 阅读图书
  userBorrowBtn: function() {
    wx.navigateTo({
      url: '/pages/user-borrow/user-borrow'
    })
  },
  // 阅读历史
  userHistoryBtn: function() {
    wx.navigateTo({
      url: '/pages/user-history/user-history'
    })
  },
  // 账户设置
  userSettingBtn: function() {
    wx.navigateTo({
      url: '/pages/user-setting/user-setting'
    })
  }
})