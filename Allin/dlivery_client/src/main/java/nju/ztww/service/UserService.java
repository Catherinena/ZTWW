package nju.ztww.service;

public interface UserService {
/*
 * 用户输入账号密码验证身份
 * 输入：String id : 用户的ID
 * 输入：String passward : 对应的密码
 * 输出：MemberVO : 该账号对应的用户信息，若不匹配则返回Null
 */
	public MemberVO login(String id, String password);
	
/*
 * 用户输出正确的订单号格式后调用该函数调出订单信息
 * 输入：String order : 订单号
 * 输出：OrderVO : 订单信息VO
 */
	public OrderVO checkOrder(String order);
	
/*
 * 用户处理某践行需要权限的事件时调用该函数，返回目前操作的用户的身份
 * 输出：MemberVO : 该页面操作的用户身份	
 */
	public position getState();
}
