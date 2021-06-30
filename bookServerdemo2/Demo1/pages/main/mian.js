// pages/main/mian.js
Page({
  /**
   * 页面的初始数据
   */
  data: {
    specialOn: false   //特殊按钮打开标志
  },

  /**
   * 生命周期函数--监听页面加载
   */
  onLoad: function () {
    var that = this;
    //获取用户信息
    that.setData({specialOn: true});
  },
  
  //点击专题跳转
  specialBtn: function (e) {
    var name = e.target.dataset.name;
    wx.navigateTo({
      url: '/pages/books-list/books-list?classifyone=' + name
    })
  }
})