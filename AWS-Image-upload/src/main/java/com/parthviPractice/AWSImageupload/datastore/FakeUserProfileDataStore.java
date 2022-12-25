package com.parthviPractice.AWSImageupload.datastore;
import com.parthviPractice.AWSImageupload.profile.UserProfile;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository
public class FakeUserProfileDataStore {
    private static final List<UserProfile>  USER_PROFILES = new ArrayList<>();

    static{
        USER_PROFILES.add(new UserProfile(UUID.fromString("de897fac-8622-4937-9791-ac60f1451901"), "jaypatel", null));
        USER_PROFILES.add(new UserProfile(UUID.fromString("f1f5e196-994d-4e95-b73e-4ced888864f4"), "parthvipatel", null));
    }

    public List<UserProfile> getUserProfiles(){
        return USER_PROFILES;
    }
}
