/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not
 * use this file except in compliance with the License. A copy of the License is
 * located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.redshift.model.transform;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.redshift.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;

/**
 * DescribeDefaultClusterParametersRequest Marshaller
 */

public class DescribeDefaultClusterParametersRequestMarshaller
        implements
        Marshaller<Request<DescribeDefaultClusterParametersRequest>, DescribeDefaultClusterParametersRequest> {

    public Request<DescribeDefaultClusterParametersRequest> marshall(
            DescribeDefaultClusterParametersRequest describeDefaultClusterParametersRequest) {

        if (describeDefaultClusterParametersRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<DescribeDefaultClusterParametersRequest> request = new DefaultRequest<DescribeDefaultClusterParametersRequest>(
                describeDefaultClusterParametersRequest, "AmazonRedshift");
        request.addParameter("Action", "DescribeDefaultClusterParameters");
        request.addParameter("Version", "2012-12-01");
        request.setHttpMethod(HttpMethodName.POST);

        if (describeDefaultClusterParametersRequest.getParameterGroupFamily() != null) {
            request.addParameter("ParameterGroupFamily", StringUtils
                    .fromString(describeDefaultClusterParametersRequest
                            .getParameterGroupFamily()));
        }

        if (describeDefaultClusterParametersRequest.getMaxRecords() != null) {
            request.addParameter("MaxRecords", StringUtils
                    .fromInteger(describeDefaultClusterParametersRequest
                            .getMaxRecords()));
        }

        if (describeDefaultClusterParametersRequest.getMarker() != null) {
            request.addParameter("Marker", StringUtils
                    .fromString(describeDefaultClusterParametersRequest
                            .getMarker()));
        }

        return request;
    }

}
