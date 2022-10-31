package entities;
// Generated Oct 31, 2022, 8:22:32 PM by Hibernate Tools 4.3.5.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * User generated by hbm2java
 */
@Entity
@Table(name = "user", catalog = "miniShop")
public class User implements java.io.Serializable {

	private long userId;
	private String username;
	private String password;
	private String email;
	private Byte gender;
	private String tel;
	private String address;
	private Date addedDate;
	private Date modifiedDate;

	public User() {
	}

	public User(long userId, String username, String password, Date addedDate) {
		this.userId = userId;
		this.username = username;
		this.password = password;
		this.addedDate = addedDate;
	}

	public User(long userId, String username, String password, String email, Byte gender, String tel, String address,
			Date addedDate, Date modifiedDate) {
		this.userId = userId;
		this.username = username;
		this.password = password;
		this.email = email;
		this.gender = gender;
		this.tel = tel;
		this.address = address;
		this.addedDate = addedDate;
		this.modifiedDate = modifiedDate;
	}

	@Id

	@Column(name = "userId", unique = true, nullable = false)
	public long getUserId() {
		return this.userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	@Column(name = "Username", nullable = false, length = 32)
	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Column(name = "Password", nullable = false, length = 64)
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Column(name = "Email", length = 64)
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "Gender")
	public Byte getGender() {
		return this.gender;
	}

	public void setGender(Byte gender) {
		this.gender = gender;
	}

	@Column(name = "Tel", length = 16)
	public String getTel() {
		return this.tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	@Column(name = "Address", length = 128)
	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "AddedDate", nullable = false, length = 19)
	public Date getAddedDate() {
		return this.addedDate;
	}

	public void setAddedDate(Date addedDate) {
		this.addedDate = addedDate;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "ModifiedDate", length = 19)
	public Date getModifiedDate() {
		return this.modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

}
