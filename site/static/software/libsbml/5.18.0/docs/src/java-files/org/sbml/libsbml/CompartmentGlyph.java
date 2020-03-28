/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.sbml.libsbml;

/** 
 * <span class="pkg-marker pkg-color-layout"><a href="group__layout.html">layout</a></span>

 A glyph for an SBML compartment.
 */

public class CompartmentGlyph extends GraphicalObject {
   private long swigCPtr;

   protected CompartmentGlyph(long cPtr, boolean cMemoryOwn)
   {
     super(libsbmlJNI.CompartmentGlyph_SWIGUpcast(cPtr), cMemoryOwn);
     swigCPtr = cPtr;
   }

   protected static long getCPtr(CompartmentGlyph obj)
   {
     return (obj == null) ? 0 : obj.swigCPtr;
   }

   protected static long getCPtrAndDisown (CompartmentGlyph obj)
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
        libsbmlJNI.delete_CompartmentGlyph(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  
/**
   * Default Constructor which creates a new {@link CompartmentGlyph}.  Id and
   * associated compartment id are unset.
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
 CompartmentGlyph(long level, long version, long pkgVersion) throws org.sbml.libsbml.SBMLConstructorException {
    this(libsbmlJNI.new_CompartmentGlyph__SWIG_0(level, version, pkgVersion), true);
  }

  
/**
   * Default Constructor which creates a new {@link CompartmentGlyph}.  Id and
   * associated compartment id are unset.
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
 CompartmentGlyph(long level, long version) throws org.sbml.libsbml.SBMLConstructorException {
    this(libsbmlJNI.new_CompartmentGlyph__SWIG_1(level, version), true);
  }

  
/**
   * Default Constructor which creates a new {@link CompartmentGlyph}.  Id and
   * associated compartment id are unset.
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
 CompartmentGlyph(long level) throws org.sbml.libsbml.SBMLConstructorException {
    this(libsbmlJNI.new_CompartmentGlyph__SWIG_2(level), true);
  }

  
/**
   * Default Constructor which creates a new {@link CompartmentGlyph}.  Id and
   * associated compartment id are unset.
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
 CompartmentGlyph() throws org.sbml.libsbml.SBMLConstructorException {
    this(libsbmlJNI.new_CompartmentGlyph__SWIG_3(), true);
  }

  
/**
   * Constructor.
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
   * @param layoutns the {@link LayoutPkgNamespaces} object.
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
 CompartmentGlyph(LayoutPkgNamespaces layoutns) throws org.sbml.libsbml.SBMLConstructorException {
    this(libsbmlJNI.new_CompartmentGlyph__SWIG_4(LayoutPkgNamespaces.getCPtr(layoutns), layoutns), true);
  }

  
/**
   * Constructor which creates a new {@link CompartmentGlyph} with the given <code>id</code>.
   <p>
   * (FOR BACKWARD COMPATIBILITY)
   */ public
 CompartmentGlyph(LayoutPkgNamespaces layoutns, String id) throws org.sbml.libsbml.SBMLConstructorException {
    this(libsbmlJNI.new_CompartmentGlyph__SWIG_5(LayoutPkgNamespaces.getCPtr(layoutns), layoutns, id), true);
  }

  
/**
   * Constructor which creates a new {@link CompartmentGlyph}.  Id and associated
   * compartment id are set to copies of the values given as arguments.
   <p>
   * (FOR BACKWARD COMPATIBILITY)
   */ public
 CompartmentGlyph(LayoutPkgNamespaces layoutns, String id, String compartmentId) throws org.sbml.libsbml.SBMLConstructorException {
    this(libsbmlJNI.new_CompartmentGlyph__SWIG_6(LayoutPkgNamespaces.getCPtr(layoutns), layoutns, id, compartmentId), true);
  }

  
/**
   * Creates a new {@link CompartmentGlyph} from the given {@link XMLNode}
   <p>
   * (FOR BACKWARD COMPATIBILITY)
   */ public
 CompartmentGlyph(XMLNode node, long l2version) throws org.sbml.libsbml.SBMLConstructorException {
    this(libsbmlJNI.new_CompartmentGlyph__SWIG_7(XMLNode.getCPtr(node), node, l2version), true);
  }

  
/**
   * Creates a new {@link CompartmentGlyph} from the given {@link XMLNode}
   <p>
   * (FOR BACKWARD COMPATIBILITY)
   */ public
 CompartmentGlyph(XMLNode node) throws org.sbml.libsbml.SBMLConstructorException {
    this(libsbmlJNI.new_CompartmentGlyph__SWIG_8(XMLNode.getCPtr(node), node), true);
  }

  
/**
   * Copy constructor.
   <p>
   * @param source the instance to copy.
   */ public
 CompartmentGlyph(CompartmentGlyph source) throws org.sbml.libsbml.SBMLConstructorException {
    this(libsbmlJNI.new_CompartmentGlyph__SWIG_9(CompartmentGlyph.getCPtr(source), source), true);
  }

  
/**
   * Returns the id of the associated compartment.
   <p>
   * @return the value of the 'compartment' attribute.
   */ public
 String getCompartmentId() {
    return libsbmlJNI.CompartmentGlyph_getCompartmentId(swigCPtr, this);
  }

  
/**
   * Sets the id of the associated compartment.
   <p>
   * @param id the identifier of a {@link Compartment} object defined elsewhere
   * in this {@link Model}.
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
 int setCompartmentId(String id) {
    return libsbmlJNI.CompartmentGlyph_setCompartmentId(swigCPtr, this, id);
  }

  
/**
   * Returns <code>true</code> if the id of the associated compartment is not the empty
   * string.
   <p>
   * @return <code>true</code> if the 'compartment' attribute of this {@link CompartmentGlyph} is
   * set, <code>false</code> otherwise.
   */ public
 boolean isSetCompartmentId() {
    return libsbmlJNI.CompartmentGlyph_isSetCompartmentId(swigCPtr, this);
  }

  
/**
   * Returns the compartment order.
   <p>
   * @return the value of the 'order' attribute.
   */ public
 double getOrder() {
    return libsbmlJNI.CompartmentGlyph_getOrder(swigCPtr, this);
  }

  
/**
   * Sets the compartment order.
   <p>
   * @param order the value to use for the 'order' attribute.
   <p>
   * <p>
 * @return integer value indicating success/failure of the
 * function.   The possible values
 * returned by this function are:
   * <ul>
   * <li> {@link libsbmlConstants#LIBSBML_OPERATION_SUCCESS LIBSBML_OPERATION_SUCCESS}
   * </ul>
   */ public
 int setOrder(double order) {
    return libsbmlJNI.CompartmentGlyph_setOrder(swigCPtr, this, order);
  }

  
/**
   * Unsets the compartment order.
   <p>
   * <p>
 * @return integer value indicating success/failure of the
 * function.   The possible values
 * returned by this function are:
   * <ul>
   * <li> {@link libsbmlConstants#LIBSBML_OPERATION_SUCCESS LIBSBML_OPERATION_SUCCESS}
   * </ul>
   */ public
 int unsetOrder() {
    return libsbmlJNI.CompartmentGlyph_unsetOrder(swigCPtr, this);
  }

  
/**
   * Returns <code>true</code> if the compartment order has been set.
   <p>
   * @return <code>true</code> if the 'order' attribute of this {@link CompartmentGlyph} is
   * set, <code>false</code> otherwise.
   */ public
 boolean isSetOrder() {
    return libsbmlJNI.CompartmentGlyph_isSetOrder(swigCPtr, this);
  }

  
/**
   * <p>
 * Replaces all uses of a given <code>SIdRef</code> type attribute value with another
 * value.
 <p>
 * <p>
 * In SBML, object identifiers are of a data type called <code>SId</code>.
 * In SBML Level&nbsp;3, an explicit data type called <code>SIdRef</code> was
 * introduced for attribute values that refer to <code>SId</code> values; in
 * previous Levels of SBML, this data type did not exist and attributes were
 * simply described to as 'referring to an identifier', but the effective
 * data type was the same as <code>SIdRef</code> in Level&nbsp;3.  These and
 * other methods of libSBML refer to the type <code>SIdRef</code> for all
 * Levels of SBML, even if the corresponding SBML specification did not
 * explicitly name the data type.
 <p>
 * This method works by looking at all attributes and (if appropriate)
 * mathematical formulas in MathML content, comparing the referenced
 * identifiers to the value of <code>oldid</code>.  If any matches are found, the
 * matching values are replaced with <code>newid</code>.  The method does <em>not</em>
 * descend into child elements.
 <p>
 * @param oldid the old identifier.
 * @param newid the new identifier.
   */ public
 void renameSIdRefs(String oldid, String newid) {
    libsbmlJNI.CompartmentGlyph_renameSIdRefs(swigCPtr, this, oldid, newid);
  }

  
/**
   * Calls initDefaults from {@link GraphicalObject}.
   */ public
 void initDefaults() {
    libsbmlJNI.CompartmentGlyph_initDefaults(swigCPtr, this);
  }

  
/**
   * Returns the XML element name of
   * this SBML object.
   <p>
   * @return the string of the name of this element.
   */ public
 String getElementName() {
    return libsbmlJNI.CompartmentGlyph_getElementName(swigCPtr, this);
  }

  
/**
   * Creates and returns a deep copy of this {@link CompartmentGlyph}.
   <p>
   * @return a (deep) copy of this {@link CompartmentGlyph}.
   */ public
 CompartmentGlyph cloneObject() {
    long cPtr = libsbmlJNI.CompartmentGlyph_cloneObject(swigCPtr, this);
    return (cPtr == 0) ? null : new CompartmentGlyph(cPtr, true);
  }

  
/**
   * Returns the libSBML type code of this object instance.
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
   * {@link libsbmlConstants#SBML_LAYOUT_COMPARTMENTGLYPH SBML_LAYOUT_COMPARTMENTGLYPH}
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
    return libsbmlJNI.CompartmentGlyph_getTypeCode(swigCPtr, this);
  }

  
/**
    * Creates an {@link XMLNode} object from this {@link CompartmentGlyph}.
    <p>
    * @return an {@link XMLNode} object based off of the information in this {@link CompartmentGlyph}.
    */ public
 XMLNode toXML() {
    return new XMLNode(libsbmlJNI.CompartmentGlyph_toXML(swigCPtr, this), true);
  }

}