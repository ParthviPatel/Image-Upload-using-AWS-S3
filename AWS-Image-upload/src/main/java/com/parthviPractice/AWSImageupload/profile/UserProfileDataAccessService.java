package com.parthviPractice.AWSImageupload.profile;

import com.parthviPractice.AWSImageupload.datastore.FakeUserProfileDataStore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository //is used to indicate that the class provides the mechanism for storage, retrieval, update, delete and search operation on objects.
public class UserProfileDataAccessService {

    private final FakeUserProfileDataStore fakeUserProfileDataStore;

   @Autowired
    public UserProfileDataAccessService(FakeUserProfileDataStore fakeUserProfileDataStore) {
        this.fakeUserProfileDataStore = fakeUserProfileDataStore;
    }
    List<UserProfile> getUserProfiles(){
       return fakeUserProfileDataStore.getUserProfiles();
   }
}
