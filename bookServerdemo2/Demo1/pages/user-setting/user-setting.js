// pages/user-setting/user-setting.js
Page({

  /**
   * 页面的初始数据
   */
  data: {
    recommendMsg: "中等",
    user: {}
  },

  /**
   * 生命周期函数--监听页面加载
   */
  onLoad: function (options) {
    var user = getApp().globalData.user;
    this.setData({user: user});
    let msg = "";
    if (this.data.user.userRecommendStatus == 0) {
      msg = "关闭";
    } else if (this.data.user.userRecommendStatus == 30) {
      msg = "少量"
    } else if (this.data.user.userRecommendStatus == 60) {
      msg = "适中";
    } else if (this.data.user.userRecommendStatus == 90) {
      msg = "大量";
    }
    this.setData({recommendMsg: msg});
  },
  cancelBtn: function() {
    wx.navigateBack({
      delta: 1
    })
  },
  sliderChange: function(e) {
    let msg = "";
    if (e.detail.value == 0) {
      msg = "关闭";
    } else if (e.detail.value == 30) {
      msg = "少量"
    } else if (e.detail.value == 60) {
      msg = "适中";
    } else if (e.detail.value == 90) {
      msg = "大量";
    }
    this.setData({recommendMsg: msg});
  },
  formSubmit: function(e) {
    var id = this.data.user.userId;
    var username = e.detail.value.username;
    var password = e.detail.value.password;
    var newStatus = 1;
    var recommendStatus = e.detail.value.recommendStatus;
    
    if (e.detail.value.newStatus.length != 1) {
      newStatus = 0;
    }

    if (recommendStatus == "") {
      recommendStatus = 0;
    }
     getApp().globalData.user.userUsername = username;
     getApp().globalData.user.userPassword = password;
     getApp().globalData.user.userNewStatus = newStatus;
     getApp().globalData.user.userRecommendStatus = recommendStatus;
     
    wx.request({
      url: getApp().globalData.url + "api-user-edit",
      data: {
        id: id,
        username: username,
        password: password,
        newStatus: newStatus,
        recommendStatus: recommendStatus
      },
      method: 'GET', 
      success: function(res){
        wx.navigateBack({
          delta: 1
        })
      }
    })
  }

})