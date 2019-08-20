package com.bytecodecomp.npos.Data_Models;

import org.json.JSONObject;

public class App_Settings {

    //Choose your store currency, Make sure the currency is supported by paypal
    private  String currency_type = "USD";


    private  String currency_symbol = "$";

    //enter you paypal client id
    private  String paypal_client_id = "AfSqTGEYye4h-C_yopiC1btOuN7MKm4lfzx-C_fiPEFMYeOuMvCMZOeMQlknYP0P60twwqaFZYV5UqW9";

    //enter sale receipt id
    private  int sale_receipt_id = 8;

    private  int require_staff_on_checkout = 1;
    private  int require_customer_on_credit_checkout = 1;

    private  int allow_user_registration = 1;

    public void setAllow_user_registration(int allow_user_registration) {
        this.allow_user_registration = allow_user_registration;
    }

    //set to true if saas is enabled and false if not
    private  boolean allow_saas = true;

    //set encrypt
    private  String crypts = "com.bytecodecomp.npos";

    //set Admin uid
    private  String admin_uid = "FkpFzcT77QS0NKxhZ0gUMCglUdi2";

    private  String store_uid  = "";

    private  String device_role = "" ;

    private  String staff_uid = "0";

    private  String staff_permissions = "0";

    private  String current_activity = "";

    public  String store_name, store_address, store_location, store_print, store_contacts, package_id, package_expiry, package_name, store_status;

    JSONObject jsonObject = new JSONObject();

    //Note, you will need to change this to match the name of your device
    private  String default_printer = "BlueTooth Printer";


    private String json_user_roles = "{\"Roles\":[{\"role\":\"owner\"},{\"role\":\"cashier\"},{\"role\":\"stock_manager\"},{\"role\":\"accounts\"},{\"role\":\"manager\"}]}";
    private String user_role = "";


    public int getRequire_staff_on_checkout() {
        return require_staff_on_checkout;
    }

    public  int getRequire_customer_on_credit_checkout() {
        return require_customer_on_credit_checkout;
    }

    public  int getAllow_user_registration() {
        return allow_user_registration;
    }

    public boolean isAllow_saas() {
        return allow_saas;
    }
    public void setAllow_saas(boolean allow_saas) {
        this.allow_saas = allow_saas;
    }

    public  String getCrypts() {
        return crypts;
    }

    public  void setCrypts(String crypts) {
        this.crypts = crypts;
    }

    public  String getAdmin_uid() {
        return admin_uid;
    }

    public  void setAdmin_uid(String admin_uid) {
        this.admin_uid = admin_uid;
    }

    public  String getStore_uid() {
        return store_uid;
    }

    public  void setStore_uid(String store_uid) {
        this.store_uid = store_uid;
    }

    public  String getDevice_role() {
        return device_role;
    }

    public  void setDevice_role(String device_role) {
        this.device_role = device_role;
    }

    public  String getStaff_uid() {
        return staff_uid;
    }

    public  void setStaff_uid(String staff_uid) {
        this.staff_uid = staff_uid;
    }

    public  String getStaff_permissions() {
        return staff_permissions;
    }

    public  void setStaff_permissions(String staff_permissions) {
        this.staff_permissions = staff_permissions;
    }

    public  String getCurrent_activity() {
        return current_activity;
    }

    public  void setCurrent_activity(String current_activity) {
        this.current_activity = current_activity;
    }

    public  String getDefault_printer() {
        return default_printer;
    }

    public  void setDefault_printer(String default_printer) {
        this.default_printer = default_printer;
    }

    public  String getJson_user_roles() {
        return json_user_roles;
    }

    public void setJson_user_roles(String json_user_roles) {
        this.json_user_roles = json_user_roles;
    }

    public String getUser_role() {
        return user_role;
    }

    public  void setUser_role(String user_role) {
        this.user_role = user_role;
    }

    public String getCurrency_type() {
        return currency_type;
    }

    public void setCurrency_type(String currency_type) {
        this.currency_type = currency_type;
    }

    public String getCurrency_symbol() {
        return currency_symbol;
    }

    public void setCurrency_symbol(String currency_symbol) {
        this.currency_symbol = currency_symbol;
    }

    public String getPaypal_client_id() {
        return paypal_client_id;
    }

    public void setPaypal_client_id(String paypal_client_id) {
        this.paypal_client_id = paypal_client_id;
    }

    public int getSale_receipt_id() {
        return sale_receipt_id;
    }

    public void setSale_receipt_id(int sale_receipt_id) {
        this.sale_receipt_id = sale_receipt_id;
    }

    public void setRequire_staff_on_checkout(int require_staff_on_checkout) {
        this.require_staff_on_checkout = require_staff_on_checkout;
    }

    public void setRequire_customer_on_credit_checkout(int require_customer_on_credit_checkout) {
        this.require_customer_on_credit_checkout = require_customer_on_credit_checkout;
    }

}
