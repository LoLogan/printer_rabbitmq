package model;

import com.sun.imageio.plugins.common.ImageUtil;

import java.io.File;

/**
 * Created by logan on 2017/4/7.
 */
public class User {

    private Integer id;

    private String userName;

    private String userAccount;

    private String userPassword;

    private Integer userPrinters;

    private String userQrcode;

    private String userStore;

    private String userAddress;

    private String userPhone;

    public User(String userName, String userAddress, String userPhone) {
        this.userName = userName;
        this.userAddress = userAddress;
        this.userPhone = userPhone;
    }

    private byte[] logoB;

    public boolean isConvert() {
        return isConvert;
    }

    public void setConvert(boolean convert) {
        isConvert = convert;
    }

    private boolean isConvert = false;



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount == null ? null : userAccount.trim();
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword == null ? null : userPassword.trim();
    }

    public Integer getUserPrinters() {
        return userPrinters;
    }

    public void setUserPrinters(Integer userPrinters) {
        this.userPrinters = userPrinters;
    }


    public String getUserQrcode() {
        return userQrcode;
    }

    public void setUserQrcode(String userQrcode) {
        this.userQrcode = userQrcode == null ? null : userQrcode.trim();
    }

    public String getUserStore() {
        return userStore;
    }

    public void setUserStore(String userStore) {
        this.userStore = userStore == null ? null : userStore.trim();
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress == null ? null : userAddress.trim();
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone == null ? null : userPhone.trim();
    }


}
