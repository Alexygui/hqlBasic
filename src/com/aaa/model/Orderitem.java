package com.aaa.model;

/**
 * Orderitem entity. @author MyEclipse Persistence Tools
 */

public class Orderitem implements java.io.Serializable {

	// Fields

<<<<<<< HEAD
<<<<<<< HEAD
	@Override
	public String toString() {
		return "Orderitem [id=" + id + ", orderid=" + orderform + ", commodity=" + commodity + ", discount=" + discount
				+ ", actprice=" + actprice + ", amount=" + amount + "]";
	}

	private Integer id;//主键，订单明细ID
	private Orderform orderform;//总订单
	private Commodity commodity;//商品编号
	private Double discount;//折扣
	private Double actprice;//价格
	private Double amount;//数量
=======
=======
>>>>>>> parent of a1f1a39... 添加查询测试方法，持久化类中添加toString方法
	private Integer id;
	private Integer orderid;
	private Integer commodity;
	private Double discount;
	private Double actprice;
	private Double amount;
>>>>>>> parent of a1f1a39... 添加查询测试方法，持久化类中添加toString方法

	// Constructors

	/** default constructor */
	public Orderitem() {
	}

	/** full constructor */
	public Orderitem(Orderform orderform, Commodity commodity, Double discount, Double actprice, Double amount) {
		this.orderform = orderform;
		this.commodity = commodity;
		this.discount = discount;
		this.actprice = actprice;
		this.amount = amount;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Orderform getOrderform() {
		return this.orderform;
	}

	public void setOrderid(Orderform orderform) {
		this.orderform = orderform;
	}

	public Commodity getCommodity() {
		return this.commodity;
	}

	public void setCommodity(Commodity commodity) {
		this.commodity = commodity;
	}

	public Double getDiscount() {
		return this.discount;
	}

	public void setDiscount(Double discount) {
		this.discount = discount;
	}

	public Double getActprice() {
		return this.actprice;
	}

	public void setActprice(Double actprice) {
		this.actprice = actprice;
	}

	public Double getAmount() {
		return this.amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

}