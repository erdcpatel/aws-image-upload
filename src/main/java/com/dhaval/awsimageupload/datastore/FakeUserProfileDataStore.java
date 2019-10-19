package com.dhaval.awsimageupload.datastore;

import com.dhaval.awsimageupload.profile.Userprofile;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository
public class FakeUserProfileDataStore {

    private static final List<Userprofile> USER_PROFILE = new ArrayList<>();

    static {
        USER_PROFILE.add(new Userprofile(UUID.fromString("1e5b927b-6204-4ed4-ad4a-78376c1b4733"), "dhaval",null));
        USER_PROFILE.add(new Userprofile(UUID.fromString("80abf342-9656-43d0-b05f-4e960fa13069"),"patel",null));
    }

    public List<Userprofile> getUserProfile(){
        return USER_PROFILE;
    }

}
