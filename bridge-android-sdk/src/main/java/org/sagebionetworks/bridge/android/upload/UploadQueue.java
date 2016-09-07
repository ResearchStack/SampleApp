package org.sagebionetworks.bridge.android.upload;

import org.sagebionetworks.bridge.researchstack.upload.UploadRequest;

import java.util.List;


public interface UploadQueue
{
    List<UploadRequest> loadUploadRequests();

    void saveUploadRequest(UploadRequest request);

    void deleteUploadRequest(UploadRequest request);
}
