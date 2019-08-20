package com.bytecodecomp.npos.Utils;

import com.bytecodecomp.npos.Data_Models.App_Settings;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.Map;

public class App_Setting_Util {
    public static App_Settings app_settings=null;

    public static App_Settings getAppSettingInstance(){
        if(null!=app_settings){
            return  app_settings;
        }else{
            app_settings=setAppAttributes(new App_Settings());
        }

        return app_settings;

    }


    private  static App_Settings setAppAttributes(final App_Settings app_settings){
        final FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference ref = database.getReference("AppConfig");
        ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                Map<String,String> map = (Map) dataSnapshot.getValue();
                app_settings.setAdmin_uid(map.get("admin_uid"));
                app_settings.setCurrent_activity(map.get("current_activity"));
                app_settings.setCrypts(map.get("crypts"));
                app_settings.setDefault_printer(map.get("default_printer"));
                app_settings.setDevice_role(map.get("device_role"));
                app_settings.setJson_user_roles(map.get("json_user_roles"));
                app_settings.setUser_role(map.get("user_role"));
                app_settings.setStaff_permissions(map.get("staff_permissions"));
                app_settings.setStore_uid(map.get("store_uid"));
                app_settings.setStaff_uid(map.get("staff_uid"));
                app_settings.setAllow_saas(Boolean.parseBoolean(map.get("allow_saas")));
                app_settings.setCurrency_symbol(map.get("allow_saas"));
                app_settings.setPaypal_client_id(map.get("paypal_client_id"));
                app_settings.setSale_receipt_id(Integer.parseInt(map.get("sale_receipt_id")));
                app_settings.setRequire_staff_on_checkout(Integer.parseInt(map.get("require_staff_on_checkout")));
                app_settings.setCurrency_type(map.get("currency_type"));
                app_settings.setRequire_customer_on_credit_checkout(Integer.parseInt(map.get("require_customer_on_credit_checkout")));
                app_settings.setAllow_user_registration(Integer.parseInt(map.get("allow_user_registration")));

            }
            @Override
            public void onCancelled(DatabaseError databaseError) {
                System.out.println("The read failed: " + databaseError.getCode());
            }
        });
        return app_settings;
    }
}
