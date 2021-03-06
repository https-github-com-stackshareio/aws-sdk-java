/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.ec2.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * DescribeNetworkInsightsPathsRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeNetworkInsightsPathsRequestMarshaller implements
        Marshaller<Request<DescribeNetworkInsightsPathsRequest>, DescribeNetworkInsightsPathsRequest> {

    public Request<DescribeNetworkInsightsPathsRequest> marshall(DescribeNetworkInsightsPathsRequest describeNetworkInsightsPathsRequest) {

        if (describeNetworkInsightsPathsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeNetworkInsightsPathsRequest> request = new DefaultRequest<DescribeNetworkInsightsPathsRequest>(describeNetworkInsightsPathsRequest,
                "AmazonEC2");
        request.addParameter("Action", "DescribeNetworkInsightsPaths");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        com.amazonaws.internal.SdkInternalList<String> describeNetworkInsightsPathsRequestNetworkInsightsPathIdsList = (com.amazonaws.internal.SdkInternalList<String>) describeNetworkInsightsPathsRequest
                .getNetworkInsightsPathIds();
        if (!describeNetworkInsightsPathsRequestNetworkInsightsPathIdsList.isEmpty()
                || !describeNetworkInsightsPathsRequestNetworkInsightsPathIdsList.isAutoConstruct()) {
            int networkInsightsPathIdsListIndex = 1;

            for (String describeNetworkInsightsPathsRequestNetworkInsightsPathIdsListValue : describeNetworkInsightsPathsRequestNetworkInsightsPathIdsList) {
                if (describeNetworkInsightsPathsRequestNetworkInsightsPathIdsListValue != null) {
                    request.addParameter("NetworkInsightsPathId." + networkInsightsPathIdsListIndex,
                            StringUtils.fromString(describeNetworkInsightsPathsRequestNetworkInsightsPathIdsListValue));
                }
                networkInsightsPathIdsListIndex++;
            }
        }

        com.amazonaws.internal.SdkInternalList<Filter> describeNetworkInsightsPathsRequestFiltersList = (com.amazonaws.internal.SdkInternalList<Filter>) describeNetworkInsightsPathsRequest
                .getFilters();
        if (!describeNetworkInsightsPathsRequestFiltersList.isEmpty() || !describeNetworkInsightsPathsRequestFiltersList.isAutoConstruct()) {
            int filtersListIndex = 1;

            for (Filter describeNetworkInsightsPathsRequestFiltersListValue : describeNetworkInsightsPathsRequestFiltersList) {

                if (describeNetworkInsightsPathsRequestFiltersListValue.getName() != null) {
                    request.addParameter("Filter." + filtersListIndex + ".Name",
                            StringUtils.fromString(describeNetworkInsightsPathsRequestFiltersListValue.getName()));
                }

                com.amazonaws.internal.SdkInternalList<String> filterValuesList = (com.amazonaws.internal.SdkInternalList<String>) describeNetworkInsightsPathsRequestFiltersListValue
                        .getValues();
                if (!filterValuesList.isEmpty() || !filterValuesList.isAutoConstruct()) {
                    int valuesListIndex = 1;

                    for (String filterValuesListValue : filterValuesList) {
                        if (filterValuesListValue != null) {
                            request.addParameter("Filter." + filtersListIndex + ".Value." + valuesListIndex, StringUtils.fromString(filterValuesListValue));
                        }
                        valuesListIndex++;
                    }
                }
                filtersListIndex++;
            }
        }

        if (describeNetworkInsightsPathsRequest.getMaxResults() != null) {
            request.addParameter("MaxResults", StringUtils.fromInteger(describeNetworkInsightsPathsRequest.getMaxResults()));
        }

        if (describeNetworkInsightsPathsRequest.getNextToken() != null) {
            request.addParameter("NextToken", StringUtils.fromString(describeNetworkInsightsPathsRequest.getNextToken()));
        }

        return request;
    }

}
