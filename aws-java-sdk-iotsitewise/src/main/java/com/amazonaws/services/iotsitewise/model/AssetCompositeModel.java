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
package com.amazonaws.services.iotsitewise.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information about a composite model in an asset. This object contains the asset's properties that you define
 * in the composite model.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/AssetCompositeModel" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssetCompositeModel implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the composite model.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The description of the composite model.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The type of the composite model. For alarm composite models, this type is <code>AWS/ALARM</code>.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The asset properties that this composite model defines.
     * </p>
     */
    private java.util.List<AssetProperty> properties;

    /**
     * <p>
     * The name of the composite model.
     * </p>
     * 
     * @param name
     *        The name of the composite model.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the composite model.
     * </p>
     * 
     * @return The name of the composite model.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the composite model.
     * </p>
     * 
     * @param name
     *        The name of the composite model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetCompositeModel withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The description of the composite model.
     * </p>
     * 
     * @param description
     *        The description of the composite model.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the composite model.
     * </p>
     * 
     * @return The description of the composite model.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the composite model.
     * </p>
     * 
     * @param description
     *        The description of the composite model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetCompositeModel withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The type of the composite model. For alarm composite models, this type is <code>AWS/ALARM</code>.
     * </p>
     * 
     * @param type
     *        The type of the composite model. For alarm composite models, this type is <code>AWS/ALARM</code>.
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of the composite model. For alarm composite models, this type is <code>AWS/ALARM</code>.
     * </p>
     * 
     * @return The type of the composite model. For alarm composite models, this type is <code>AWS/ALARM</code>.
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of the composite model. For alarm composite models, this type is <code>AWS/ALARM</code>.
     * </p>
     * 
     * @param type
     *        The type of the composite model. For alarm composite models, this type is <code>AWS/ALARM</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetCompositeModel withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The asset properties that this composite model defines.
     * </p>
     * 
     * @return The asset properties that this composite model defines.
     */

    public java.util.List<AssetProperty> getProperties() {
        return properties;
    }

    /**
     * <p>
     * The asset properties that this composite model defines.
     * </p>
     * 
     * @param properties
     *        The asset properties that this composite model defines.
     */

    public void setProperties(java.util.Collection<AssetProperty> properties) {
        if (properties == null) {
            this.properties = null;
            return;
        }

        this.properties = new java.util.ArrayList<AssetProperty>(properties);
    }

    /**
     * <p>
     * The asset properties that this composite model defines.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setProperties(java.util.Collection)} or {@link #withProperties(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param properties
     *        The asset properties that this composite model defines.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetCompositeModel withProperties(AssetProperty... properties) {
        if (this.properties == null) {
            setProperties(new java.util.ArrayList<AssetProperty>(properties.length));
        }
        for (AssetProperty ele : properties) {
            this.properties.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The asset properties that this composite model defines.
     * </p>
     * 
     * @param properties
     *        The asset properties that this composite model defines.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetCompositeModel withProperties(java.util.Collection<AssetProperty> properties) {
        setProperties(properties);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getProperties() != null)
            sb.append("Properties: ").append(getProperties());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssetCompositeModel == false)
            return false;
        AssetCompositeModel other = (AssetCompositeModel) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getProperties() == null ^ this.getProperties() == null)
            return false;
        if (other.getProperties() != null && other.getProperties().equals(this.getProperties()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getProperties() == null) ? 0 : getProperties().hashCode());
        return hashCode;
    }

    @Override
    public AssetCompositeModel clone() {
        try {
            return (AssetCompositeModel) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotsitewise.model.transform.AssetCompositeModelMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
