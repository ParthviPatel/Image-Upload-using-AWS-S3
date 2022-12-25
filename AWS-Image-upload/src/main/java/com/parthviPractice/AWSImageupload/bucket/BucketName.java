package com.parthviPractice.AWSImageupload.bucket;

public enum BucketName {

    PROFILE_IMAGE("parthvitesting-image-upload");

    public String getBucketName() {
        return bucketName;
    }

    BucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    private final String bucketName;

}
