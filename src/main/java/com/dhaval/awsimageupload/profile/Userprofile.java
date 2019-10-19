package com.dhaval.awsimageupload.profile;

import java.util.Objects;
import java.util.Optional;
import java.util.UUID;

public class Userprofile {

    private final UUID userProfileId;
    private final String userName;
    private String userProfileImageLink; //s3 key

    public Userprofile(UUID userProfileId, String userName, String userProfileImageLink) {
        this.userProfileId = userProfileId;
        this.userName = userName;
        this.userProfileImageLink = userProfileImageLink;
    }

    public UUID getUserProfileId() {
        return userProfileId;
    }

    public String getUserName() {
        return userName;
    }

    public Optional<String> getUserProfileImageLink() {
        return Optional.ofNullable(userProfileImageLink);
    }

    public void setUserProfileImageLink(String userProfileImageLink) {
        this.userProfileImageLink = userProfileImageLink;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Userprofile)) return false;
        Userprofile that = (Userprofile) o;
        return Objects.equals(userProfileId , that.userProfileId) &&
                Objects.equals(userName,that.userName) &&
                Objects.equals(userProfileImageLink,that.userProfileImageLink);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getUserProfileId(), getUserName(), getUserProfileImageLink());
    }
}
