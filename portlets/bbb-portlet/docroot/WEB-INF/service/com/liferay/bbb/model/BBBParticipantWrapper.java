/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.bbb.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link BBBParticipant}.
 * </p>
 *
 * @author Shinn Lok
 * @see BBBParticipant
 * @generated
 */
public class BBBParticipantWrapper implements BBBParticipant,
	ModelWrapper<BBBParticipant> {
	public BBBParticipantWrapper(BBBParticipant bbbParticipant) {
		_bbbParticipant = bbbParticipant;
	}

	@Override
	public Class<?> getModelClass() {
		return BBBParticipant.class;
	}

	@Override
	public String getModelClassName() {
		return BBBParticipant.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("bbbParticipantId", getBbbParticipantId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("bbbMeetingId", getBbbMeetingId());
		attributes.put("name", getName());
		attributes.put("emailAddress", getEmailAddress());
		attributes.put("type", getType());
		attributes.put("status", getStatus());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long bbbParticipantId = (Long)attributes.get("bbbParticipantId");

		if (bbbParticipantId != null) {
			setBbbParticipantId(bbbParticipantId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		Long bbbMeetingId = (Long)attributes.get("bbbMeetingId");

		if (bbbMeetingId != null) {
			setBbbMeetingId(bbbMeetingId);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		String emailAddress = (String)attributes.get("emailAddress");

		if (emailAddress != null) {
			setEmailAddress(emailAddress);
		}

		Integer type = (Integer)attributes.get("type");

		if (type != null) {
			setType(type);
		}

		Integer status = (Integer)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}
	}

	/**
	* Returns the primary key of this b b b participant.
	*
	* @return the primary key of this b b b participant
	*/
	@Override
	public long getPrimaryKey() {
		return _bbbParticipant.getPrimaryKey();
	}

	/**
	* Sets the primary key of this b b b participant.
	*
	* @param primaryKey the primary key of this b b b participant
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_bbbParticipant.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the bbb participant ID of this b b b participant.
	*
	* @return the bbb participant ID of this b b b participant
	*/
	@Override
	public long getBbbParticipantId() {
		return _bbbParticipant.getBbbParticipantId();
	}

	/**
	* Sets the bbb participant ID of this b b b participant.
	*
	* @param bbbParticipantId the bbb participant ID of this b b b participant
	*/
	@Override
	public void setBbbParticipantId(long bbbParticipantId) {
		_bbbParticipant.setBbbParticipantId(bbbParticipantId);
	}

	/**
	* Returns the group ID of this b b b participant.
	*
	* @return the group ID of this b b b participant
	*/
	@Override
	public long getGroupId() {
		return _bbbParticipant.getGroupId();
	}

	/**
	* Sets the group ID of this b b b participant.
	*
	* @param groupId the group ID of this b b b participant
	*/
	@Override
	public void setGroupId(long groupId) {
		_bbbParticipant.setGroupId(groupId);
	}

	/**
	* Returns the company ID of this b b b participant.
	*
	* @return the company ID of this b b b participant
	*/
	@Override
	public long getCompanyId() {
		return _bbbParticipant.getCompanyId();
	}

	/**
	* Sets the company ID of this b b b participant.
	*
	* @param companyId the company ID of this b b b participant
	*/
	@Override
	public void setCompanyId(long companyId) {
		_bbbParticipant.setCompanyId(companyId);
	}

	/**
	* Returns the user ID of this b b b participant.
	*
	* @return the user ID of this b b b participant
	*/
	@Override
	public long getUserId() {
		return _bbbParticipant.getUserId();
	}

	/**
	* Sets the user ID of this b b b participant.
	*
	* @param userId the user ID of this b b b participant
	*/
	@Override
	public void setUserId(long userId) {
		_bbbParticipant.setUserId(userId);
	}

	/**
	* Returns the user uuid of this b b b participant.
	*
	* @return the user uuid of this b b b participant
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _bbbParticipant.getUserUuid();
	}

	/**
	* Sets the user uuid of this b b b participant.
	*
	* @param userUuid the user uuid of this b b b participant
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_bbbParticipant.setUserUuid(userUuid);
	}

	/**
	* Returns the user name of this b b b participant.
	*
	* @return the user name of this b b b participant
	*/
	@Override
	public java.lang.String getUserName() {
		return _bbbParticipant.getUserName();
	}

	/**
	* Sets the user name of this b b b participant.
	*
	* @param userName the user name of this b b b participant
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_bbbParticipant.setUserName(userName);
	}

	/**
	* Returns the create date of this b b b participant.
	*
	* @return the create date of this b b b participant
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _bbbParticipant.getCreateDate();
	}

	/**
	* Sets the create date of this b b b participant.
	*
	* @param createDate the create date of this b b b participant
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_bbbParticipant.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this b b b participant.
	*
	* @return the modified date of this b b b participant
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _bbbParticipant.getModifiedDate();
	}

	/**
	* Sets the modified date of this b b b participant.
	*
	* @param modifiedDate the modified date of this b b b participant
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_bbbParticipant.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the bbb meeting ID of this b b b participant.
	*
	* @return the bbb meeting ID of this b b b participant
	*/
	@Override
	public long getBbbMeetingId() {
		return _bbbParticipant.getBbbMeetingId();
	}

	/**
	* Sets the bbb meeting ID of this b b b participant.
	*
	* @param bbbMeetingId the bbb meeting ID of this b b b participant
	*/
	@Override
	public void setBbbMeetingId(long bbbMeetingId) {
		_bbbParticipant.setBbbMeetingId(bbbMeetingId);
	}

	/**
	* Returns the name of this b b b participant.
	*
	* @return the name of this b b b participant
	*/
	@Override
	public java.lang.String getName() {
		return _bbbParticipant.getName();
	}

	/**
	* Sets the name of this b b b participant.
	*
	* @param name the name of this b b b participant
	*/
	@Override
	public void setName(java.lang.String name) {
		_bbbParticipant.setName(name);
	}

	/**
	* Returns the email address of this b b b participant.
	*
	* @return the email address of this b b b participant
	*/
	@Override
	public java.lang.String getEmailAddress() {
		return _bbbParticipant.getEmailAddress();
	}

	/**
	* Sets the email address of this b b b participant.
	*
	* @param emailAddress the email address of this b b b participant
	*/
	@Override
	public void setEmailAddress(java.lang.String emailAddress) {
		_bbbParticipant.setEmailAddress(emailAddress);
	}

	/**
	* Returns the type of this b b b participant.
	*
	* @return the type of this b b b participant
	*/
	@Override
	public int getType() {
		return _bbbParticipant.getType();
	}

	/**
	* Sets the type of this b b b participant.
	*
	* @param type the type of this b b b participant
	*/
	@Override
	public void setType(int type) {
		_bbbParticipant.setType(type);
	}

	/**
	* Returns the status of this b b b participant.
	*
	* @return the status of this b b b participant
	*/
	@Override
	public int getStatus() {
		return _bbbParticipant.getStatus();
	}

	/**
	* Sets the status of this b b b participant.
	*
	* @param status the status of this b b b participant
	*/
	@Override
	public void setStatus(int status) {
		_bbbParticipant.setStatus(status);
	}

	@Override
	public boolean isNew() {
		return _bbbParticipant.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_bbbParticipant.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _bbbParticipant.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_bbbParticipant.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _bbbParticipant.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _bbbParticipant.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_bbbParticipant.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _bbbParticipant.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_bbbParticipant.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_bbbParticipant.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_bbbParticipant.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new BBBParticipantWrapper((BBBParticipant)_bbbParticipant.clone());
	}

	@Override
	public int compareTo(com.liferay.bbb.model.BBBParticipant bbbParticipant) {
		return _bbbParticipant.compareTo(bbbParticipant);
	}

	@Override
	public int hashCode() {
		return _bbbParticipant.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.liferay.bbb.model.BBBParticipant> toCacheModel() {
		return _bbbParticipant.toCacheModel();
	}

	@Override
	public com.liferay.bbb.model.BBBParticipant toEscapedModel() {
		return new BBBParticipantWrapper(_bbbParticipant.toEscapedModel());
	}

	@Override
	public com.liferay.bbb.model.BBBParticipant toUnescapedModel() {
		return new BBBParticipantWrapper(_bbbParticipant.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _bbbParticipant.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _bbbParticipant.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_bbbParticipant.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof BBBParticipantWrapper)) {
			return false;
		}

		BBBParticipantWrapper bbbParticipantWrapper = (BBBParticipantWrapper)obj;

		if (Validator.equals(_bbbParticipant,
					bbbParticipantWrapper._bbbParticipant)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public BBBParticipant getWrappedBBBParticipant() {
		return _bbbParticipant;
	}

	@Override
	public BBBParticipant getWrappedModel() {
		return _bbbParticipant;
	}

	@Override
	public void resetOriginalValues() {
		_bbbParticipant.resetOriginalValues();
	}

	private BBBParticipant _bbbParticipant;
}