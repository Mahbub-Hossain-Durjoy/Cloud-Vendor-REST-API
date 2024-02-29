package com.mahbub.restdemo.service;

import com.mahbub.restdemo.model.CloudVendor;

import java.util.List;

public interface CloudVendorService {
    public String createCloudVendor(CloudVendor cloudVendor);
    public String updateCloudVendor(CloudVendor cloudVendor);
    public String deleteCloudVendor(String cloudVendorId);
    public CloudVendor getCloudVendor(String cloudVendorId);

    List<CloudVendor> getByVendorName(String vendorName);

    public List<CloudVendor> getAllCloudVendors();
}
