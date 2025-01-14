/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.route53.model;

import java.io.Serializable;

/**
 * <p>
 * A complex type that contains information about a geo location.
 * </p>
 */
public class GeoLocation implements Serializable, Cloneable {

    /**
     * <p>
     * The two-letter code for the continent.
     * </p>
     * <p>
     * Valid values: <code>AF</code> | <code>AN</code> | <code>AS</code> | <code>EU</code> | <code>OC</code> |
     * <code>NA</code> | <code>SA</code>
     * </p>
     * <p>
     * Constraint: Specifying <code>ContinentCode</code> with either <code>CountryCode</code> or
     * <code>SubdivisionCode</code> returns an <code>InvalidInput</code> error.
     * </p>
     */
    private String continentCode;
    /**
     * <p>
     * The two-letter code for the country.
     * </p>
     */
    private String countryCode;
    /**
     * <p>
     * The code for the subdivision, for example, a state in the United States or a province in Canada.
     * </p>
     */
    private String subdivisionCode;

    /**
     * <p>
     * The two-letter code for the continent.
     * </p>
     * <p>
     * Valid values: <code>AF</code> | <code>AN</code> | <code>AS</code> | <code>EU</code> | <code>OC</code> |
     * <code>NA</code> | <code>SA</code>
     * </p>
     * <p>
     * Constraint: Specifying <code>ContinentCode</code> with either <code>CountryCode</code> or
     * <code>SubdivisionCode</code> returns an <code>InvalidInput</code> error.
     * </p>
     * 
     * @param continentCode
     *        The two-letter code for the continent.</p>
     *        <p>
     *        Valid values: <code>AF</code> | <code>AN</code> | <code>AS</code> | <code>EU</code> | <code>OC</code> |
     *        <code>NA</code> | <code>SA</code>
     *        </p>
     *        <p>
     *        Constraint: Specifying <code>ContinentCode</code> with either <code>CountryCode</code> or
     *        <code>SubdivisionCode</code> returns an <code>InvalidInput</code> error.
     */

    public void setContinentCode(String continentCode) {
        this.continentCode = continentCode;
    }

    /**
     * <p>
     * The two-letter code for the continent.
     * </p>
     * <p>
     * Valid values: <code>AF</code> | <code>AN</code> | <code>AS</code> | <code>EU</code> | <code>OC</code> |
     * <code>NA</code> | <code>SA</code>
     * </p>
     * <p>
     * Constraint: Specifying <code>ContinentCode</code> with either <code>CountryCode</code> or
     * <code>SubdivisionCode</code> returns an <code>InvalidInput</code> error.
     * </p>
     * 
     * @return The two-letter code for the continent.</p>
     *         <p>
     *         Valid values: <code>AF</code> | <code>AN</code> | <code>AS</code> | <code>EU</code> | <code>OC</code> |
     *         <code>NA</code> | <code>SA</code>
     *         </p>
     *         <p>
     *         Constraint: Specifying <code>ContinentCode</code> with either <code>CountryCode</code> or
     *         <code>SubdivisionCode</code> returns an <code>InvalidInput</code> error.
     */

    public String getContinentCode() {
        return this.continentCode;
    }

    /**
     * <p>
     * The two-letter code for the continent.
     * </p>
     * <p>
     * Valid values: <code>AF</code> | <code>AN</code> | <code>AS</code> | <code>EU</code> | <code>OC</code> |
     * <code>NA</code> | <code>SA</code>
     * </p>
     * <p>
     * Constraint: Specifying <code>ContinentCode</code> with either <code>CountryCode</code> or
     * <code>SubdivisionCode</code> returns an <code>InvalidInput</code> error.
     * </p>
     * 
     * @param continentCode
     *        The two-letter code for the continent.</p>
     *        <p>
     *        Valid values: <code>AF</code> | <code>AN</code> | <code>AS</code> | <code>EU</code> | <code>OC</code> |
     *        <code>NA</code> | <code>SA</code>
     *        </p>
     *        <p>
     *        Constraint: Specifying <code>ContinentCode</code> with either <code>CountryCode</code> or
     *        <code>SubdivisionCode</code> returns an <code>InvalidInput</code> error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GeoLocation withContinentCode(String continentCode) {
        setContinentCode(continentCode);
        return this;
    }

    /**
     * <p>
     * The two-letter code for the country.
     * </p>
     * 
     * @param countryCode
     *        The two-letter code for the country.
     */

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    /**
     * <p>
     * The two-letter code for the country.
     * </p>
     * 
     * @return The two-letter code for the country.
     */

    public String getCountryCode() {
        return this.countryCode;
    }

    /**
     * <p>
     * The two-letter code for the country.
     * </p>
     * 
     * @param countryCode
     *        The two-letter code for the country.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GeoLocation withCountryCode(String countryCode) {
        setCountryCode(countryCode);
        return this;
    }

    /**
     * <p>
     * The code for the subdivision, for example, a state in the United States or a province in Canada.
     * </p>
     * 
     * @param subdivisionCode
     *        The code for the subdivision, for example, a state in the United States or a province in Canada.
     */

    public void setSubdivisionCode(String subdivisionCode) {
        this.subdivisionCode = subdivisionCode;
    }

    /**
     * <p>
     * The code for the subdivision, for example, a state in the United States or a province in Canada.
     * </p>
     * 
     * @return The code for the subdivision, for example, a state in the United States or a province in Canada.
     */

    public String getSubdivisionCode() {
        return this.subdivisionCode;
    }

    /**
     * <p>
     * The code for the subdivision, for example, a state in the United States or a province in Canada.
     * </p>
     * 
     * @param subdivisionCode
     *        The code for the subdivision, for example, a state in the United States or a province in Canada.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GeoLocation withSubdivisionCode(String subdivisionCode) {
        setSubdivisionCode(subdivisionCode);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getContinentCode() != null)
            sb.append("ContinentCode: ").append(getContinentCode()).append(",");
        if (getCountryCode() != null)
            sb.append("CountryCode: ").append(getCountryCode()).append(",");
        if (getSubdivisionCode() != null)
            sb.append("SubdivisionCode: ").append(getSubdivisionCode());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GeoLocation == false)
            return false;
        GeoLocation other = (GeoLocation) obj;
        if (other.getContinentCode() == null ^ this.getContinentCode() == null)
            return false;
        if (other.getContinentCode() != null && other.getContinentCode().equals(this.getContinentCode()) == false)
            return false;
        if (other.getCountryCode() == null ^ this.getCountryCode() == null)
            return false;
        if (other.getCountryCode() != null && other.getCountryCode().equals(this.getCountryCode()) == false)
            return false;
        if (other.getSubdivisionCode() == null ^ this.getSubdivisionCode() == null)
            return false;
        if (other.getSubdivisionCode() != null && other.getSubdivisionCode().equals(this.getSubdivisionCode()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getContinentCode() == null) ? 0 : getContinentCode().hashCode());
        hashCode = prime * hashCode + ((getCountryCode() == null) ? 0 : getCountryCode().hashCode());
        hashCode = prime * hashCode + ((getSubdivisionCode() == null) ? 0 : getSubdivisionCode().hashCode());
        return hashCode;
    }

    @Override
    public GeoLocation clone() {
        try {
            return (GeoLocation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
