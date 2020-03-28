/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.sbml.libsbml;

/** 
 * <span class="pkg-marker pkg-color-multi"><a href="group__multi.html">multi</a></span>
 Defines a feature of a multi {@link Species}.
 <p>
 * Each {@link SpeciesFeature} object is a child of the {@link MultiSpeciesPlugin}, which
 * extends the {@link Species}.  Each defines one feature of the parent {@link Species}.  It
 * has three optional attributes, 'id', 'name' and 'component', and two
 * required attributes, 'speciesFeatureType' and 'occur', and a required
 * child {@link ListOfSpeciesFeatureValues}. {@link SpeciesFeature} serves to define the
 * state of a component in a species by selecting values from the
 * {@link ListOfPossibleSpeciesFeatureValues} of the referenced {@link SpeciesFeatureType}.
 * Its 'speciesFeatureType' attribue references the particular
 * {@link SpeciesFeatureType} of which this {@link Species} is an example.  The 'occur'
 * attribute defines the number of instances of the referenced
 * {@link SpeciesFeatureType}.  The optional 'component' attribute, of type SIdRef,
 * can be used to indicate which component of a {@link Species} the {@link SpeciesFeature}
 * belongs to, and is required when the component cannot be identified only
 * based on the speciesFeatureType attribute.  The {@link ListOfSpeciesFeatureValues}
 * contain one or more {@link SpeciesFeatureValue} objects&mdash;if more than one, the
 * relationship between them is 'or', defining a list of mutually exclusive
 * possibilities.  Each {@link SpeciesFeatureValue} serves to specify a value for a
 * {@link SpeciesFeature} to select from the {@link ListOfPossibleSpeciesFeatureValues}
 * defined in the referenced {@link SpeciesFeatureType}.
 */

public class SpeciesFeature extends SBase {
   private long swigCPtr;

   protected SpeciesFeature(long cPtr, boolean cMemoryOwn)
   {
     super(libsbmlJNI.SpeciesFeature_SWIGUpcast(cPtr), cMemoryOwn);
     swigCPtr = cPtr;
   }

   protected static long getCPtr(SpeciesFeature obj)
   {
     return (obj == null) ? 0 : obj.swigCPtr;
   }

   protected static long getCPtrAndDisown (SpeciesFeature obj)
   {
     long ptr = 0;

     if (obj != null)
     {
       ptr             = obj.swigCPtr;
       obj.swigCMemOwn = false;
     }

     return ptr;
   }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        libsbmlJNI.delete_SpeciesFeature(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  
/**
   * Creates a new {@link SpeciesFeature} object.
   <p>
   * @param level the SBML Level.
   * @param version the Version within the SBML Level.
   * @param pkgVersion the version of the package.
   <p>
   * <p>
 * @note Attempting to add an object to an {@link SBMLDocument} having a different
 * combination of SBML Level, Version and XML namespaces than the object
 * itself will result in an error at the time a caller attempts to make the
 * addition.  A parent object must have compatible Level, Version and XML
 * namespaces.  (Strictly speaking, a parent may also have more XML
 * namespaces than a child, but the reverse is not permitted.)  The
 * restriction is necessary to ensure that an SBML model has a consistent
 * overall structure.  This requires callers to manage their objects
 * carefully, but the benefit is increased flexibility in how models can be
 * created by permitting callers to create objects bottom-up if desired.  In
 * situations where objects are not yet attached to parents (e.g.,
 * {@link SBMLDocument}), knowledge of the intented SBML Level and Version help
 * libSBML determine such things as whether it is valid to assign a
 * particular value to an attribute.  For packages, this means that the 
 * parent object to which this package element is being added must have
 * been created with the package namespace, or that the package namespace
 * was added to it, even if that parent is not a package object itself.
   */ public
 SpeciesFeature(long level, long version, long pkgVersion) throws org.sbml.libsbml.SBMLConstructorException {
    this(libsbmlJNI.new_SpeciesFeature__SWIG_0(level, version, pkgVersion), true);
  }

  
/**
   * Creates a new {@link SpeciesFeature} object.
   <p>
   * @param level the SBML Level.
   * @param version the Version within the SBML Level.
   * @param pkgVersion the version of the package.
   <p>
   * <p>
 * @note Attempting to add an object to an {@link SBMLDocument} having a different
 * combination of SBML Level, Version and XML namespaces than the object
 * itself will result in an error at the time a caller attempts to make the
 * addition.  A parent object must have compatible Level, Version and XML
 * namespaces.  (Strictly speaking, a parent may also have more XML
 * namespaces than a child, but the reverse is not permitted.)  The
 * restriction is necessary to ensure that an SBML model has a consistent
 * overall structure.  This requires callers to manage their objects
 * carefully, but the benefit is increased flexibility in how models can be
 * created by permitting callers to create objects bottom-up if desired.  In
 * situations where objects are not yet attached to parents (e.g.,
 * {@link SBMLDocument}), knowledge of the intented SBML Level and Version help
 * libSBML determine such things as whether it is valid to assign a
 * particular value to an attribute.  For packages, this means that the 
 * parent object to which this package element is being added must have
 * been created with the package namespace, or that the package namespace
 * was added to it, even if that parent is not a package object itself.
   */ public
 SpeciesFeature(long level, long version) throws org.sbml.libsbml.SBMLConstructorException {
    this(libsbmlJNI.new_SpeciesFeature__SWIG_1(level, version), true);
  }

  
/**
   * Creates a new {@link SpeciesFeature} object.
   <p>
   * @param level the SBML Level.
   * @param version the Version within the SBML Level.
   * @param pkgVersion the version of the package.
   <p>
   * <p>
 * @note Attempting to add an object to an {@link SBMLDocument} having a different
 * combination of SBML Level, Version and XML namespaces than the object
 * itself will result in an error at the time a caller attempts to make the
 * addition.  A parent object must have compatible Level, Version and XML
 * namespaces.  (Strictly speaking, a parent may also have more XML
 * namespaces than a child, but the reverse is not permitted.)  The
 * restriction is necessary to ensure that an SBML model has a consistent
 * overall structure.  This requires callers to manage their objects
 * carefully, but the benefit is increased flexibility in how models can be
 * created by permitting callers to create objects bottom-up if desired.  In
 * situations where objects are not yet attached to parents (e.g.,
 * {@link SBMLDocument}), knowledge of the intented SBML Level and Version help
 * libSBML determine such things as whether it is valid to assign a
 * particular value to an attribute.  For packages, this means that the 
 * parent object to which this package element is being added must have
 * been created with the package namespace, or that the package namespace
 * was added to it, even if that parent is not a package object itself.
   */ public
 SpeciesFeature(long level) throws org.sbml.libsbml.SBMLConstructorException {
    this(libsbmlJNI.new_SpeciesFeature__SWIG_2(level), true);
  }

  
/**
   * Creates a new {@link SpeciesFeature} object.
   <p>
   * @param level the SBML Level.
   * @param version the Version within the SBML Level.
   * @param pkgVersion the version of the package.
   <p>
   * <p>
 * @note Attempting to add an object to an {@link SBMLDocument} having a different
 * combination of SBML Level, Version and XML namespaces than the object
 * itself will result in an error at the time a caller attempts to make the
 * addition.  A parent object must have compatible Level, Version and XML
 * namespaces.  (Strictly speaking, a parent may also have more XML
 * namespaces than a child, but the reverse is not permitted.)  The
 * restriction is necessary to ensure that an SBML model has a consistent
 * overall structure.  This requires callers to manage their objects
 * carefully, but the benefit is increased flexibility in how models can be
 * created by permitting callers to create objects bottom-up if desired.  In
 * situations where objects are not yet attached to parents (e.g.,
 * {@link SBMLDocument}), knowledge of the intented SBML Level and Version help
 * libSBML determine such things as whether it is valid to assign a
 * particular value to an attribute.  For packages, this means that the 
 * parent object to which this package element is being added must have
 * been created with the package namespace, or that the package namespace
 * was added to it, even if that parent is not a package object itself.
   */ public
 SpeciesFeature() throws org.sbml.libsbml.SBMLConstructorException {
    this(libsbmlJNI.new_SpeciesFeature__SWIG_3(), true);
  }

  
/**
   * Creates a new {@link SpeciesFeature} with the given {@link MultiPkgNamespaces} object.
   <p>
   * <p>
 * The package namespaces object used in this constructor is derived from a
 * {@link SBMLNamespaces} object, which encapsulates SBML Level/Version/namespaces
 * information.  It is used to communicate the SBML Level, Version, and 
 * package version and name information used in addition to SBML Level&nbsp;3 Core.  A
 * common approach to using libSBML's {@link SBMLNamespaces} facilities is to create an
 * package namespace object somewhere in a program once, then hand that object
 * as needed to object constructors of that package that accept it as and
 * argument, such as this one.
   <p>
   * @param multins the {@link MultiPkgNamespaces} object
   <p>
   * <p>
 * @note Attempting to add an object to an {@link SBMLDocument} having a different
 * combination of SBML Level, Version and XML namespaces than the object
 * itself will result in an error at the time a caller attempts to make the
 * addition.  A parent object must have compatible Level, Version and XML
 * namespaces.  (Strictly speaking, a parent may also have more XML
 * namespaces than a child, but the reverse is not permitted.)  The
 * restriction is necessary to ensure that an SBML model has a consistent
 * overall structure.  This requires callers to manage their objects
 * carefully, but the benefit is increased flexibility in how models can be
 * created by permitting callers to create objects bottom-up if desired.  In
 * situations where objects are not yet attached to parents (e.g.,
 * {@link SBMLDocument}), knowledge of the intented SBML Level and Version help
 * libSBML determine such things as whether it is valid to assign a
 * particular value to an attribute.  For packages, this means that the 
 * parent object to which this package element is being added must have
 * been created with the package namespace, or that the package namespace
 * was added to it, even if that parent is not a package object itself.
   */ public
 SpeciesFeature(MultiPkgNamespaces multins) throws org.sbml.libsbml.SBMLConstructorException {
    this(libsbmlJNI.new_SpeciesFeature__SWIG_4(MultiPkgNamespaces.getCPtr(multins), multins), true);
  }

  
/**
   * Copy constructor for {@link SpeciesFeature}.
   <p>
   * @param orig the {@link SpeciesFeature} instance to copy.
   */ public
 SpeciesFeature(SpeciesFeature orig) throws org.sbml.libsbml.SBMLConstructorException {
    this(libsbmlJNI.new_SpeciesFeature__SWIG_5(SpeciesFeature.getCPtr(orig), orig), true);
  }

  
/**
   * Creates and returns a deep copy of this {@link SpeciesFeature} object.
   <p>
   * @return a (deep) copy of this {@link SpeciesFeature} object.
   */ public
 SpeciesFeature cloneObject() {
    long cPtr = libsbmlJNI.SpeciesFeature_cloneObject(swigCPtr, this);
    return (cPtr == 0) ? null : new SpeciesFeature(cPtr, true);
  }

  
/**
   * Returns the value of the 'id' attribute of this {@link SpeciesFeature}.
   <p>
   * @return the value of the 'id' attribute of this {@link SpeciesFeature} as a
   * string.
   */ public
 String getId() {
    return libsbmlJNI.SpeciesFeature_getId(swigCPtr, this);
  }

  
/**
   * Returns <code>true</code> if this {@link SpeciesFeature}'s 'id' attribute has been set.
   <p>
   * @return <code>true</code> if this {@link SpeciesFeature}'s 'id' attribute has been set;
   * otherwise, <code>false</code> is returned.
   */ public
 boolean isSetId() {
    return libsbmlJNI.SpeciesFeature_isSetId(swigCPtr, this);
  }

  
/**
   * Sets the value of the 'id' attribute of this {@link SpeciesFeature}.
   <p>
   * @param id String value of the 'id' attribute to be set
   <p>
   * <p>
 * @return integer value indicating success/failure of the
 * function.   The possible values
 * returned by this function are:
   * <ul>
   * <li> {@link libsbmlConstants#LIBSBML_OPERATION_SUCCESS LIBSBML_OPERATION_SUCCESS}
   * <li> {@link libsbmlConstants#LIBSBML_INVALID_ATTRIBUTE_VALUE LIBSBML_INVALID_ATTRIBUTE_VALUE}
   * </ul>
   */ public
 int setId(String id) {
    return libsbmlJNI.SpeciesFeature_setId(swigCPtr, this, id);
  }

  
/**
   * Unsets the value of the 'id' attribute of this {@link SpeciesFeature}.
   <p>
   * <p>
 * @return integer value indicating success/failure of the
 * function.   The possible values
 * returned by this function are:
   * <ul>
   * <li> {@link libsbmlConstants#LIBSBML_OPERATION_SUCCESS LIBSBML_OPERATION_SUCCESS}
   * <li> {@link libsbmlConstants#LIBSBML_OPERATION_FAILED LIBSBML_OPERATION_FAILED}
   * </ul>
   */ public
 int unsetId() {
    return libsbmlJNI.SpeciesFeature_unsetId(swigCPtr, this);
  }

  
/**
   * Returns the value of the 'name' attribute of this {@link SpeciesFeature}.
   <p>
   * @return the value of the 'name' attribute of this {@link SpeciesFeature} as a string.
   */ public
 String getName() {
    return libsbmlJNI.SpeciesFeature_getName(swigCPtr, this);
  }

  
/**
   * Returns <code>true</code> if this {@link SpeciesFeature}'s 'name' attribute has been set.
   <p>
   * @return <code>true</code> if this {@link SpeciesFeature}'s 'name' attribute has been set;
   * otherwise, <code>false</code> is returned.
   */ public
 boolean isSetName() {
    return libsbmlJNI.SpeciesFeature_isSetName(swigCPtr, this);
  }

  
/**
   * Sets the value of the 'name' attribute of this {@link SpeciesFeature}.
   <p>
   * @param name String value of the 'name' attribute to be set
   <p>
   * <p>
 * @return integer value indicating success/failure of the
 * function.   The possible values
 * returned by this function are:
   * <ul>
   * <li> {@link libsbmlConstants#LIBSBML_OPERATION_SUCCESS LIBSBML_OPERATION_SUCCESS}
   * <li> {@link libsbmlConstants#LIBSBML_INVALID_ATTRIBUTE_VALUE LIBSBML_INVALID_ATTRIBUTE_VALUE}
   * </ul>
   */ public
 int setName(String name) {
    return libsbmlJNI.SpeciesFeature_setName(swigCPtr, this, name);
  }

  
/**
   * Unsets the value of the 'name' attribute of this {@link SpeciesFeature}.
   <p>
   * <p>
 * @return integer value indicating success/failure of the
 * function.   The possible values
 * returned by this function are:
   * <ul>
   * <li> {@link libsbmlConstants#LIBSBML_OPERATION_SUCCESS LIBSBML_OPERATION_SUCCESS}
   * <li> {@link libsbmlConstants#LIBSBML_OPERATION_FAILED LIBSBML_OPERATION_FAILED}
   * </ul>
   */ public
 int unsetName() {
    return libsbmlJNI.SpeciesFeature_unsetName(swigCPtr, this);
  }

  
/**
   * Returns the value of the 'speciesFeatureType' attribute of this
   * {@link SpeciesFeature}.
   <p>
   * @return the value of the 'speciesFeatureType' attribute of this
   * {@link SpeciesFeature} as a string.
   */ public
 String getSpeciesFeatureType() {
    return libsbmlJNI.SpeciesFeature_getSpeciesFeatureType(swigCPtr, this);
  }

  
/**
   * Returns <code>true</code> if this {@link SpeciesFeature}'s 'speciesFeatureType' attribute
   * has been set.
   <p>
   * @return <code>true</code> if this {@link SpeciesFeature}'s 'speciesFeatureType' attribute
   * has been set; otherwise, <code>false</code> is returned.
   */ public
 boolean isSetSpeciesFeatureType() {
    return libsbmlJNI.SpeciesFeature_isSetSpeciesFeatureType(swigCPtr, this);
  }

  
/**
   * Sets the value of the 'speciesFeatureType' attribute of this {@link SpeciesFeature}.
   <p>
   * @param speciesFeatureType the new value for the 'speciesFeatureType'
   * attribute.
   <p>
   * <p>
 * @return integer value indicating success/failure of the
 * function.   The possible values
 * returned by this function are:
   * <ul>
   * <li> {@link libsbmlConstants#LIBSBML_OPERATION_SUCCESS LIBSBML_OPERATION_SUCCESS}
   * <li> {@link libsbmlConstants#LIBSBML_INVALID_ATTRIBUTE_VALUE LIBSBML_INVALID_ATTRIBUTE_VALUE}
   * </ul>
   */ public
 int setSpeciesFeatureType(String speciesFeatureType) {
    return libsbmlJNI.SpeciesFeature_setSpeciesFeatureType(swigCPtr, this, speciesFeatureType);
  }

  
/**
   * Unsets the value of the 'speciesFeatureType' attribute of this {@link SpeciesFeature}.
   <p>
   * <p>
 * @return integer value indicating success/failure of the
 * function.   The possible values
 * returned by this function are:
   * <ul>
   * <li> {@link libsbmlConstants#LIBSBML_OPERATION_SUCCESS LIBSBML_OPERATION_SUCCESS}
   * <li> {@link libsbmlConstants#LIBSBML_OPERATION_FAILED LIBSBML_OPERATION_FAILED}
   * </ul>
   */ public
 int unsetSpeciesFeatureType() {
    return libsbmlJNI.SpeciesFeature_unsetSpeciesFeatureType(swigCPtr, this);
  }

  
/**
   * Returns the value of the 'occur' attribute of this {@link SpeciesFeature}.
   <p>
   * @return the value of the 'occur' attribute of this {@link SpeciesFeature} as a
   * longeger.
   */ public
 long getOccur() {
    return libsbmlJNI.SpeciesFeature_getOccur(swigCPtr, this);
  }

  
/**
   * Returns <code>true</code> if this {@link SpeciesFeature}'s 'occur' attribute has been set.
   <p>
   * @return <code>true</code> if this {@link SpeciesFeature}'s 'occur' attribute has been set;
   * otherwise, <code>false</code> is returned.
   */ public
 boolean isSetOccur() {
    return libsbmlJNI.SpeciesFeature_isSetOccur(swigCPtr, this);
  }

  
/**
   * Sets the value of the 'occur' attribute of this {@link SpeciesFeature}.
   <p>
   * @param occur long value of the 'occur' attribute to be set
   <p>
   * <p>
 * @return integer value indicating success/failure of the
 * function.   The possible values
 * returned by this function are:
   * <ul>
   * <li> {@link libsbmlConstants#LIBSBML_OPERATION_SUCCESS LIBSBML_OPERATION_SUCCESS}
   * <li> {@link libsbmlConstants#LIBSBML_INVALID_ATTRIBUTE_VALUE LIBSBML_INVALID_ATTRIBUTE_VALUE}
   * </ul>
   */ public
 int setOccur(long occur) {
    return libsbmlJNI.SpeciesFeature_setOccur(swigCPtr, this, occur);
  }

  
/**
   * Unsets the value of the 'occur' attribute of this {@link SpeciesFeature}.
   <p>
   * <p>
 * @return integer value indicating success/failure of the
 * function.   The possible values
 * returned by this function are:
   * <ul>
   * <li> {@link libsbmlConstants#LIBSBML_OPERATION_SUCCESS LIBSBML_OPERATION_SUCCESS}
   * <li> {@link libsbmlConstants#LIBSBML_OPERATION_FAILED LIBSBML_OPERATION_FAILED}
   * </ul>
   */ public
 int unsetOccur() {
    return libsbmlJNI.SpeciesFeature_unsetOccur(swigCPtr, this);
  }

  
/**
   * Returns the value of the 'component' attribute of this {@link SpeciesFeature}.
   <p>
   * @return the value of the 'component' attribute of this {@link SpeciesFeature} as
   * a string.
   */ public
 String getComponent() {
    return libsbmlJNI.SpeciesFeature_getComponent(swigCPtr, this);
  }

  
/**
   * Returns <code>true</code> if this {@link SpeciesFeature}'s 'component' attribute has been
   * set.
   <p>
   * @return <code>true</code> if this {@link SpeciesFeature}'s 'component' attribute has been
   * set; otherwise, <code>false</code> is returned.
   */ public
 boolean isSetComponent() {
    return libsbmlJNI.SpeciesFeature_isSetComponent(swigCPtr, this);
  }

  
/**
   * Sets the value of the 'component' attribute of this {@link SpeciesFeature}.
   <p>
   * @param component the new value of the attribute.
   <p>
   * <p>
 * @return integer value indicating success/failure of the
 * function.   The possible values
 * returned by this function are:
   * <ul>
   * <li> {@link libsbmlConstants#LIBSBML_OPERATION_SUCCESS LIBSBML_OPERATION_SUCCESS}
   * <li> {@link libsbmlConstants#LIBSBML_INVALID_ATTRIBUTE_VALUE LIBSBML_INVALID_ATTRIBUTE_VALUE}
   * </ul>
   */ public
 int setComponent(String component) {
    return libsbmlJNI.SpeciesFeature_setComponent(swigCPtr, this, component);
  }

  
/**
   * Unsets the value of the 'component' attribute of this {@link SpeciesFeature}.
   <p>
   * <p>
 * @return integer value indicating success/failure of the
 * function.   The possible values
 * returned by this function are:
   * <ul>
   * <li> {@link libsbmlConstants#LIBSBML_OPERATION_SUCCESS LIBSBML_OPERATION_SUCCESS}
   * <li> {@link libsbmlConstants#LIBSBML_OPERATION_FAILED LIBSBML_OPERATION_FAILED}
   * </ul>
   */ public
 int unsetComponent() {
    return libsbmlJNI.SpeciesFeature_unsetComponent(swigCPtr, this);
  }

  
/**
   * Returns the {@link ListOfSpeciesFeatureValues} in this {@link SpeciesFeature} object.
   <p>
   * @return the {@link ListOfSpeciesFeatureValues} child of this {@link SpeciesFeature}.
   */ public
 ListOfSpeciesFeatureValues getListOfSpeciesFeatureValues() {
    long cPtr = libsbmlJNI.SpeciesFeature_getListOfSpeciesFeatureValues__SWIG_0(swigCPtr, this);
    return (cPtr == 0) ? null : new ListOfSpeciesFeatureValues(cPtr, false);
  }

  
/**
   * Get the nth {@link SpeciesFeatureValue} object from the
   * {@link ListOfSpeciesFeatureValues}.
   <p>
   * @param n the index number of the {@link SpeciesFeatureValue} to get.
   <p>
   * @return the nth object, or <code>null</code> if the index <code>is</code> out of range.
   <p>
   * @see #getNumSpeciesFeatureValues()
   */ public
 SpeciesFeatureValue getSpeciesFeatureValue(long n) {
    long cPtr = libsbmlJNI.SpeciesFeature_getSpeciesFeatureValue__SWIG_0(swigCPtr, this, n);
    return (cPtr == 0) ? null : new SpeciesFeatureValue(cPtr, false);
  }

  
/**
   * Get the {@link SpeciesFeatureValue} object with the given identifier <code>sid</code>.
   <p>
   * @param sid a string representing the identifier of the
   * {@link SpeciesFeatureValue} to get.
   <p>
   * @return the object with the given id, or <code>null</code> if no such object exists.
   <p>
   * @see #getSpeciesFeatureValue(long n)
   * @see #getNumSpeciesFeatureValues()
   */ public
 SpeciesFeatureValue getSpeciesFeatureValue(String sid) {
    long cPtr = libsbmlJNI.SpeciesFeature_getSpeciesFeatureValue__SWIG_2(swigCPtr, this, sid);
    return (cPtr == 0) ? null : new SpeciesFeatureValue(cPtr, false);
  }

  
/**
   * Adds a copy the given 'SpeciesFeatureValue' to this {@link SpeciesFeature}.
   <p>
   * @param sfv the {@link SpeciesFeatureValue} object to add
   <p>
   * <p>
 * @return integer value indicating success/failure of the
 * function.   The possible values
 * returned by this function are:
   * <ul>
   * <li> {@link libsbmlConstants#LIBSBML_OPERATION_SUCCESS LIBSBML_OPERATION_SUCCESS}
   * <li> {@link libsbmlConstants#LIBSBML_INVALID_ATTRIBUTE_VALUE LIBSBML_INVALID_ATTRIBUTE_VALUE}
   * </ul>
   */ public
 int addSpeciesFeatureValue(SpeciesFeatureValue sfv) {
    return libsbmlJNI.SpeciesFeature_addSpeciesFeatureValue(swigCPtr, this, SpeciesFeatureValue.getCPtr(sfv), sfv);
  }

  
/**
   * Get the number of {@link SpeciesFeatureValue} objects in this {@link SpeciesFeature}.
   <p>
   * @return the number of {@link SpeciesFeatureValue} objects in this {@link SpeciesFeature}
   */ public
 long getNumSpeciesFeatureValues() {
    return libsbmlJNI.SpeciesFeature_getNumSpeciesFeatureValues(swigCPtr, this);
  }

  
/**
   * Creates a new {@link SpeciesFeatureValue} object and adds it to this
   * SpeciesFeatures {@link ListOfSpeciesFeatureValues}.
   <p>
   * @return a new {@link SpeciesFeatureValue} object instance
   <p>
   * @see #addSpeciesFeatureValue(SpeciesFeatureValue sfv)
   */ public
 SpeciesFeatureValue createSpeciesFeatureValue() {
    long cPtr = libsbmlJNI.SpeciesFeature_createSpeciesFeatureValue(swigCPtr, this);
    return (cPtr == 0) ? null : new SpeciesFeatureValue(cPtr, false);
  }

  
/**
   * Removes the nth {@link SpeciesFeatureValue} from the {@link ListOfSpeciesFeatureValues}.
   <p>
   * @param n the index of the {@link SpeciesFeatureValue} to remove.
   <p>
   * @return the object removed, or <code>null</code> if no such object exists.  Note that
   * the caller owns the returned object and is responsible for deleting it.
   <p>
   * @see #getNumSpeciesFeatureValues()
   */ public
 SpeciesFeatureValue removeSpeciesFeatureValue(long n) {
    long cPtr = libsbmlJNI.SpeciesFeature_removeSpeciesFeatureValue__SWIG_0(swigCPtr, this, n);
    return (cPtr == 0) ? null : new SpeciesFeatureValue(cPtr, true);
  }

  
/**
   * Removes the {@link SpeciesFeatureValue} object with the given identifier <code>sid</code>.
   <p>
   * @param sid the identifier of the {@link SpeciesFeatureValue} to remove.
   <p>
   * @return the object removed, or <code>null</code> if no such object exists.  Note that
   * the caller owns the returned object and is responsible for deleting it.
   */ public
 SpeciesFeatureValue removeSpeciesFeatureValue(String sid) {
    long cPtr = libsbmlJNI.SpeciesFeature_removeSpeciesFeatureValue__SWIG_1(swigCPtr, this, sid);
    return (cPtr == 0) ? null : new SpeciesFeatureValue(cPtr, true);
  }

  
/**
   * Renames all the <code>SIdRef</code> attributes on this element, including any
   * found in MathML content (if such exists).
   <p>
   * This method works by looking at all attributes and (if appropriate)
   * mathematical formulas, comparing the identifiers to the value of 
   * <code>oldid</code>.  If any matches are found, the matching identifiers are replaced
   * with <code>newid</code>.  The method does <em>not</em> descend into child elements.
   <p>
   * @param oldid the old identifier
   * @param newid the new identifier
   */ public
 void renameSIdRefs(String oldid, String newid) {
    libsbmlJNI.SpeciesFeature_renameSIdRefs(swigCPtr, this, oldid, newid);
  }

  
/**
   * Returns the XML element name of this object.
   <p>
   * @return the name of this element, i.e. <code>'speciesFeature'.</code>
   */ public
 String getElementName() {
    return libsbmlJNI.SpeciesFeature_getElementName(swigCPtr, this);
  }

  
/**
   * Returns the libSBML type code for this SBML object.
   <p>
   * <p>
 * LibSBML attaches an identifying code to every kind of SBML object.  These
 * are integer constants known as <em>SBML type codes</em>.  The names of all
 * the codes begin with the characters <code>SBML_</code>.
 * In the Java language interface for libSBML, the
 * type codes are defined as static integer constants in the interface class
 * {@link libsbmlConstants}.    Note that different Level&nbsp;3
 * package plug-ins may use overlapping type codes; to identify the package
 * to which a given object belongs, call the 
 * <code>{@link SBase#getPackageName()}
 * </code>
 * method on the object.
 <p>
 * The exception to this is lists:  all SBML-style list elements have the type 
 * {@link libsbmlConstants#SBML_LIST_OF SBML_LIST_OF}, regardless of what package they 
 * are from.
   <p>
   * @return the SBML type code for this object:
   * {@link libsbmlConstants#SBML_MULTI_BINDING_SITE_SPECIES_TYPE SBML_MULTI_BINDING_SITE_SPECIES_TYPE}.
   <p>
   * <p>
 * @warning <span class='warning'>The specific integer values of the possible
 * type codes may be reused by different libSBML plug-ins for SBML Level&nbsp;3.
 * packages,  To fully identify the correct code, <strong>it is necessary to
 * invoke both getPackageName() and getTypeCode()</strong> (or 
 * {@link ListOf#getItemTypeCode()}).</span>
   <p>
   * @see #getElementName()
   * @see #getPackageName()
   */ public
 int getTypeCode() {
    return libsbmlJNI.SpeciesFeature_getTypeCode(swigCPtr, this);
  }

  
/**
   * Returns <code>true</code> if this {@link SpeciesFeature} object has all the required
   * attributes.
   <p>
   * @note The required attributes for a {@link SpeciesFeature} object are:
   * <ul>
   * <li> 'speciesFeatureType'
   * <li> 'occur'
   *
   * </ul> <p>
   * @return a boolean value indicating whether all the required
   * attributes for this object have been defined.
   */ public
 boolean hasRequiredAttributes() {
    return libsbmlJNI.SpeciesFeature_hasRequiredAttributes(swigCPtr, this);
  }

  
/**
   * Returns <code>true</code> if {@link SpeciesFeature} has all the required subelements.
   <p>
   * @note A {@link SpeciesFeature} object has no required subelements.
   <p>
   * @return a boolean value indicating whether all the required
   * elements for this object have been defined.
   */ public
 boolean hasRequiredElements() {
    return libsbmlJNI.SpeciesFeature_hasRequiredElements(swigCPtr, this);
  }

  
/** * @internal */ public
 void connectToChild() {
    libsbmlJNI.SpeciesFeature_connectToChild(swigCPtr, this);
  }

  
/** * @internal */ public
 void enablePackageInternal(String pkgURI, String pkgPrefix, boolean flag) {
    libsbmlJNI.SpeciesFeature_enablePackageInternal(swigCPtr, this, pkgURI, pkgPrefix, flag);
  }

}