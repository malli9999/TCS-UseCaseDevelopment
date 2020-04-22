package io.usecase.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
public class DemoRewardsModel {

	@Id
	private String USER_ID;
	private int RewardsAccountID;
	private int RewardBalance;
	private String RewardType;
	private String RewardsRedeemStatus;
	private String RewardsExpiry;
	
	
	
	
	
	public DemoRewardsModel() {
		super();
	}
	
	public DemoRewardsModel(String uSER_ID, int rewardsAccountID, int rewardBalance, String rewardType,
			String rewardsRedeemStatus, String rewardsExpiry) {
		super();
		USER_ID = uSER_ID;
		RewardsAccountID = rewardsAccountID;
		RewardBalance = rewardBalance;
		RewardType = rewardType;
		RewardsRedeemStatus = rewardsRedeemStatus;
		RewardsExpiry = rewardsExpiry;
	}
	public String getUSER_ID() {
		return USER_ID;
	}
	public void setUSER_ID(String uSER_ID) {
		USER_ID = uSER_ID;
	}
	public int getRewardsAccountID() {
		return RewardsAccountID;
	}
	public void setRewardsAccountID(int rewardsAccountID) {
		RewardsAccountID = rewardsAccountID;
	}
	public int getRewardBalance() {
		return RewardBalance;
	}
	public void setRewardBalance(int rewardBalance) {
		RewardBalance = rewardBalance;
	}
	public String getRewardType() {
		return RewardType;
	}
	public void setRewardType(String rewardType) {
		RewardType = rewardType;
	}
	public String getRewardsRedeemStatus() {
		return RewardsRedeemStatus;
	}
	public void setRewardsRedeemStatus(String rewardsRedeemStatus) {
		RewardsRedeemStatus = rewardsRedeemStatus;
	}
	public String getRewardsExpiry() {
		return RewardsExpiry;
	}
	public void setRewardsExpiry(String rewardsExpiry) {
		RewardsExpiry = rewardsExpiry;
	}
	
	
}
