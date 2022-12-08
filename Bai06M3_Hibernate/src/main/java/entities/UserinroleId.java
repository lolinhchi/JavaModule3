package entities;
// Generated Oct 31, 2022, 8:22:32 PM by Hibernate Tools 4.3.5.Final

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * UserinroleId generated by hbm2java
 */
@Embeddable
public class UserinroleId implements java.io.Serializable {

	private int roleId;
	private long userId;

	public UserinroleId() {
	}

	public UserinroleId(int roleId, long userId) {
		this.roleId = roleId;
		this.userId = userId;
	}

	@Column(name = "RoleId", nullable = false)
	public int getRoleId() {
		return this.roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	@Column(name = "userId", nullable = false)
	public long getUserId() {
		return this.userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof UserinroleId))
			return false;
		UserinroleId castOther = (UserinroleId) other;

		return (this.getRoleId() == castOther.getRoleId()) && (this.getUserId() == castOther.getUserId());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getRoleId();
		result = 37 * result + (int) this.getUserId();
		return result;
	}

}