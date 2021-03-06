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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Lists a summary of the properties of a context. A context provides a logical grouping of other entities.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ContextSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ContextSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the context.
     * </p>
     */
    private String contextArn;
    /**
     * <p>
     * The name of the context.
     * </p>
     */
    private String contextName;
    /**
     * <p>
     * The source of the context.
     * </p>
     */
    private ContextSource source;
    /**
     * <p>
     * The type of the context.
     * </p>
     */
    private String contextType;
    /**
     * <p>
     * When the context was created.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * When the context was last modified.
     * </p>
     */
    private java.util.Date lastModifiedTime;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the context.
     * </p>
     * 
     * @param contextArn
     *        The Amazon Resource Name (ARN) of the context.
     */

    public void setContextArn(String contextArn) {
        this.contextArn = contextArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the context.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the context.
     */

    public String getContextArn() {
        return this.contextArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the context.
     * </p>
     * 
     * @param contextArn
     *        The Amazon Resource Name (ARN) of the context.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContextSummary withContextArn(String contextArn) {
        setContextArn(contextArn);
        return this;
    }

    /**
     * <p>
     * The name of the context.
     * </p>
     * 
     * @param contextName
     *        The name of the context.
     */

    public void setContextName(String contextName) {
        this.contextName = contextName;
    }

    /**
     * <p>
     * The name of the context.
     * </p>
     * 
     * @return The name of the context.
     */

    public String getContextName() {
        return this.contextName;
    }

    /**
     * <p>
     * The name of the context.
     * </p>
     * 
     * @param contextName
     *        The name of the context.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContextSummary withContextName(String contextName) {
        setContextName(contextName);
        return this;
    }

    /**
     * <p>
     * The source of the context.
     * </p>
     * 
     * @param source
     *        The source of the context.
     */

    public void setSource(ContextSource source) {
        this.source = source;
    }

    /**
     * <p>
     * The source of the context.
     * </p>
     * 
     * @return The source of the context.
     */

    public ContextSource getSource() {
        return this.source;
    }

    /**
     * <p>
     * The source of the context.
     * </p>
     * 
     * @param source
     *        The source of the context.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContextSummary withSource(ContextSource source) {
        setSource(source);
        return this;
    }

    /**
     * <p>
     * The type of the context.
     * </p>
     * 
     * @param contextType
     *        The type of the context.
     */

    public void setContextType(String contextType) {
        this.contextType = contextType;
    }

    /**
     * <p>
     * The type of the context.
     * </p>
     * 
     * @return The type of the context.
     */

    public String getContextType() {
        return this.contextType;
    }

    /**
     * <p>
     * The type of the context.
     * </p>
     * 
     * @param contextType
     *        The type of the context.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContextSummary withContextType(String contextType) {
        setContextType(contextType);
        return this;
    }

    /**
     * <p>
     * When the context was created.
     * </p>
     * 
     * @param creationTime
     *        When the context was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * When the context was created.
     * </p>
     * 
     * @return When the context was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * When the context was created.
     * </p>
     * 
     * @param creationTime
     *        When the context was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContextSummary withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * When the context was last modified.
     * </p>
     * 
     * @param lastModifiedTime
     *        When the context was last modified.
     */

    public void setLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    /**
     * <p>
     * When the context was last modified.
     * </p>
     * 
     * @return When the context was last modified.
     */

    public java.util.Date getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * <p>
     * When the context was last modified.
     * </p>
     * 
     * @param lastModifiedTime
     *        When the context was last modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContextSummary withLastModifiedTime(java.util.Date lastModifiedTime) {
        setLastModifiedTime(lastModifiedTime);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getContextArn() != null)
            sb.append("ContextArn: ").append(getContextArn()).append(",");
        if (getContextName() != null)
            sb.append("ContextName: ").append(getContextName()).append(",");
        if (getSource() != null)
            sb.append("Source: ").append(getSource()).append(",");
        if (getContextType() != null)
            sb.append("ContextType: ").append(getContextType()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getLastModifiedTime() != null)
            sb.append("LastModifiedTime: ").append(getLastModifiedTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ContextSummary == false)
            return false;
        ContextSummary other = (ContextSummary) obj;
        if (other.getContextArn() == null ^ this.getContextArn() == null)
            return false;
        if (other.getContextArn() != null && other.getContextArn().equals(this.getContextArn()) == false)
            return false;
        if (other.getContextName() == null ^ this.getContextName() == null)
            return false;
        if (other.getContextName() != null && other.getContextName().equals(this.getContextName()) == false)
            return false;
        if (other.getSource() == null ^ this.getSource() == null)
            return false;
        if (other.getSource() != null && other.getSource().equals(this.getSource()) == false)
            return false;
        if (other.getContextType() == null ^ this.getContextType() == null)
            return false;
        if (other.getContextType() != null && other.getContextType().equals(this.getContextType()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getLastModifiedTime() == null ^ this.getLastModifiedTime() == null)
            return false;
        if (other.getLastModifiedTime() != null && other.getLastModifiedTime().equals(this.getLastModifiedTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getContextArn() == null) ? 0 : getContextArn().hashCode());
        hashCode = prime * hashCode + ((getContextName() == null) ? 0 : getContextName().hashCode());
        hashCode = prime * hashCode + ((getSource() == null) ? 0 : getSource().hashCode());
        hashCode = prime * hashCode + ((getContextType() == null) ? 0 : getContextType().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedTime() == null) ? 0 : getLastModifiedTime().hashCode());
        return hashCode;
    }

    @Override
    public ContextSummary clone() {
        try {
            return (ContextSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.ContextSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
