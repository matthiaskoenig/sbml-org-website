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
 A list of {@link CompartmentReference} objects.
 <p>
 * The {@link ListOfCompartmentReferences} is a container for {@link CompartmentReference} objects.
 <p>
 * <p>
 * The various ListOf___ classes in SBML
 * are merely containers used for organizing the main components of an SBML
 * model.  In libSBML's implementation, ListOf___
 * classes are derived from the
 * intermediate utility class {@link ListOf}, which
 * is not defined by the SBML specifications but serves as a useful
 * programmatic construct.  {@link ListOf} is itself is in turn derived from {@link SBase},
 * which provides all of the various ListOf___
 * classes with common features
 * defined by the SBML specification, such as 'metaid' attributes and
 * annotations.
 <p>
 * The relationship between the lists and the rest of an SBML model is
 * illustrated by the following (for SBML Level&nbsp;2 Version&nbsp;4):
 <p>
 * <figure>
  <object type="image/svg+xml" data="listof-illustration.svg" class="centered"></object>
</figure>

 <p>
 * SBML Level&nbsp;3 Version&nbsp;1 has essentially the same structure as 
 * Level&nbsp;2 Version&nbsp;4, depicted above, but SBML Level&nbsp;3 
 * Version&nbsp;2 allows
 * containers to contain zero or more of the relevant object, instead of 
 * requiring at least one.  As such, libsbml will write out an 
 * otherwise-empty ListOf___ element that has any optional attribute set 
 * (such as 'id' or 'metaid'), that has an optional child (such 
 * as a 'notes' or 'annotation'), or that has attributes or children set
 * from any SBML Level&nbsp;3 package, whether or not the ListOf___ has 
 * any other children.
 <p>
 * Readers may wonder about the motivations for using the ListOf___
 * containers in SBML.  A simpler approach in XML might be to place the
 * components all directly at the top level of the model definition.  The
 * choice made in SBML is to group them within XML elements named after
 * ListOf<em>Classname</em>, in part because it helps organize the
 * components.  More importantly, the fact that the container classes are
 * derived from {@link SBase} means that software tools can add information <em>about</em>
 * the lists themselves into each list container's 'annotation'.
 <p>
 * @see ListOfFunctionDefinitions
 * @see ListOfUnitDefinitions
 * @see ListOfCompartmentTypes
 * @see ListOfSpeciesTypes
 * @see ListOfCompartments
 * @see ListOfSpecies
 * @see ListOfParameters
 * @see ListOfInitialAssignments
 * @see ListOfRules
 * @see ListOfConstraints
 * @see ListOfReactions
 * @see ListOfEvents
 <p>
 * @see CompartmentReference
 */

public class ListOfCompartmentReferences extends ListOf {
   private long swigCPtr;

   protected ListOfCompartmentReferences(long cPtr, boolean cMemoryOwn)
   {
     super(libsbmlJNI.ListOfCompartmentReferences_SWIGUpcast(cPtr), cMemoryOwn);
     swigCPtr = cPtr;
   }

   protected static long getCPtr(ListOfCompartmentReferences obj)
   {
     return (obj == null) ? 0 : obj.swigCPtr;
   }

   protected static long getCPtrAndDisown (ListOfCompartmentReferences obj)
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
        libsbmlJNI.delete_ListOfCompartmentReferences(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  
/**
   * Creates a new {@link ListOfCompartmentReferences} with the given level, version, and package version.
   <p>
   * @param level a long integer, the SBML Level to assign to this {@link ListOfCompartmentReferences}
   <p>
   * @param version a long integer, the SBML Version to assign to this {@link ListOfCompartmentReferences}
   <p>
   * @param pkgVersion a long integer, the SBML Multi Version to assign to this {@link ListOfCompartmentReferences}
   */ public
 ListOfCompartmentReferences(long level, long version, long pkgVersion) throws org.sbml.libsbml.SBMLConstructorException {
    this(libsbmlJNI.new_ListOfCompartmentReferences__SWIG_0(level, version, pkgVersion), true);
  }

  
/**
   * Creates a new {@link ListOfCompartmentReferences} with the given level, version, and package version.
   <p>
   * @param level a long integer, the SBML Level to assign to this {@link ListOfCompartmentReferences}
   <p>
   * @param version a long integer, the SBML Version to assign to this {@link ListOfCompartmentReferences}
   <p>
   * @param pkgVersion a long integer, the SBML Multi Version to assign to this {@link ListOfCompartmentReferences}
   */ public
 ListOfCompartmentReferences(long level, long version) throws org.sbml.libsbml.SBMLConstructorException {
    this(libsbmlJNI.new_ListOfCompartmentReferences__SWIG_1(level, version), true);
  }

  
/**
   * Creates a new {@link ListOfCompartmentReferences} with the given level, version, and package version.
   <p>
   * @param level a long integer, the SBML Level to assign to this {@link ListOfCompartmentReferences}
   <p>
   * @param version a long integer, the SBML Version to assign to this {@link ListOfCompartmentReferences}
   <p>
   * @param pkgVersion a long integer, the SBML Multi Version to assign to this {@link ListOfCompartmentReferences}
   */ public
 ListOfCompartmentReferences(long level) throws org.sbml.libsbml.SBMLConstructorException {
    this(libsbmlJNI.new_ListOfCompartmentReferences__SWIG_2(level), true);
  }

  
/**
   * Creates a new {@link ListOfCompartmentReferences} with the given level, version, and package version.
   <p>
   * @param level a long integer, the SBML Level to assign to this {@link ListOfCompartmentReferences}
   <p>
   * @param version a long integer, the SBML Version to assign to this {@link ListOfCompartmentReferences}
   <p>
   * @param pkgVersion a long integer, the SBML Multi Version to assign to this {@link ListOfCompartmentReferences}
   */ public
 ListOfCompartmentReferences() throws org.sbml.libsbml.SBMLConstructorException {
    this(libsbmlJNI.new_ListOfCompartmentReferences__SWIG_3(), true);
  }

  
/**
   * Creates a new {@link ListOfCompartmentReferences} with the given {@link MultiPkgNamespaces} object.
   <p>
   * @param multins the {@link MultiPkgNamespaces} object
   */ public
 ListOfCompartmentReferences(MultiPkgNamespaces multins) throws org.sbml.libsbml.SBMLConstructorException {
    this(libsbmlJNI.new_ListOfCompartmentReferences__SWIG_4(MultiPkgNamespaces.getCPtr(multins), multins), true);
  }

  
/**
   * Creates and returns a deep copy of this {@link ListOfCompartmentReferences} object.
   <p>
   * @return a (deep) copy of this {@link ListOfCompartmentReferences} object.
   */ public
 ListOfCompartmentReferences cloneObject() {
    long cPtr = libsbmlJNI.ListOfCompartmentReferences_cloneObject(swigCPtr, this);
    return (cPtr == 0) ? null : new ListOfCompartmentReferences(cPtr, true);
  }

  
/**
   * Get a {@link CompartmentReference} from the {@link ListOfCompartmentReferences}.
   <p>
   * @param n the index number of the {@link CompartmentReference} to get.
   <p>
   * @return the nth {@link CompartmentReference} in this {@link ListOfCompartmentReferences}.
   * If the index <code>n</code> is invalid, <code>null</code> is returned.
   <p>
   * @see #size()
   */ public
 CompartmentReference get(long n) {
    long cPtr = libsbmlJNI.ListOfCompartmentReferences_get__SWIG_0(swigCPtr, this, n);
    return (cPtr == 0) ? null : new CompartmentReference(cPtr, false);
  }

  
/**
   * Get a {@link CompartmentReference} from the {@link ListOfCompartmentReferences}
   * based on its identifier.
   <p>
   * @param sid a string representing the identifier
   * of the {@link CompartmentReference} to get.
   <p>
   * @return {@link CompartmentReference} in this {@link ListOfCompartmentReferences}
   * with the given id or <code>null</code> if no such
   * {@link CompartmentReference} exists.
   <p>
   * @see #get(long n)   *
   * @see #size()
   */ public
 CompartmentReference get(String sid) {
    long cPtr = libsbmlJNI.ListOfCompartmentReferences_get__SWIG_2(swigCPtr, this, sid);
    return (cPtr == 0) ? null : new CompartmentReference(cPtr, false);
  }

  
/**
   * Removes the nth {@link CompartmentReference} from this {@link ListOfCompartmentReferences}
   * and returns a pointer to it.
   <p>
   * The caller owns the returned item and is responsible for deleting it.
   <p>
   * @param n the index of the {@link CompartmentReference} to remove.
   <p>
   * @see #size()
   */ public
 CompartmentReference remove(long n) {
    long cPtr = libsbmlJNI.ListOfCompartmentReferences_remove__SWIG_0(swigCPtr, this, n);
    return (cPtr == 0) ? null : new CompartmentReference(cPtr, true);
  }

  
/**
   * Removes the {@link CompartmentReference} from this {@link ListOfCompartmentReferences} with the given identifier
   * and returns a pointer to it.
   <p>
   * The caller owns the returned item and is responsible for deleting it.
   * If none of the items in this list have the identifier <code>sid</code>, then
   * <code>null</code> is returned.
   <p>
   * @param sid the identifier of the {@link CompartmentReference} to remove.
   <p>
   * @return the {@link CompartmentReference} removed. As mentioned above, the caller owns the
   * returned item.
   */ public
 CompartmentReference remove(String sid) {
    long cPtr = libsbmlJNI.ListOfCompartmentReferences_remove__SWIG_1(swigCPtr, this, sid);
    return (cPtr == 0) ? null : new CompartmentReference(cPtr, true);
  }

  
/**
   * Returns the XML element name of this object, which for {@link ListOfCompartmentReferences}, is
   * always <code>'listOfCompartmentReferences'.</code>
   <p>
   * @return the name of this element, i.e. <code>'listOfCompartmentReferences'.</code>
   */ public
 String getElementName() {
    return libsbmlJNI.ListOfCompartmentReferences_getElementName(swigCPtr, this);
  }

  
/**
   * Returns the libSBML type code for this SBML object.
   <p>
   * LibSBML attaches an identifying code to every
   * kind of SBML object.  These are known as <em>SBML type codes</em>.  In
   * other languages, the set of type codes is stored in an enumeration; in
   * the Java language interface for libSBML, the type codes are defined as
   * static integer constants in the interface class {@link
   * libsbmlConstants}.  The names of the type codes all begin with the
   * characters <code>SBML_.</code> 
   <p>
   * @return the SBML type code for this object, or
   * {@link libsbmlConstants#SBML_UNKNOWN SBML_UNKNOWN} (default).
   <p>
   * @see #getElementName()
   */ public
 int getTypeCode() {
    return libsbmlJNI.ListOfCompartmentReferences_getTypeCode(swigCPtr, this);
  }

  
/**
   * Returns the libSBML type code for the SBML objects
   * contained in this {@link ListOf} object
   <p>
   * LibSBML attaches an identifying code to every
   * kind of SBML object.  These are known as <em>SBML type codes</em>.  In
   * other languages, the set of type codes is stored in an enumeration; in
   * the Java language interface for libSBML, the type codes are defined as
   * static integer constants in the interface class {@link
   * libsbmlConstants}.  The names of the type codes all begin with the
   * characters <code>SBML_.</code> 
   <p>
   * @return the SBML type code for the objects in this {@link ListOf} instance, or
   * {@link libsbmlConstants#SBML_UNKNOWN SBML_UNKNOWN} (default).
   <p>
   * @see #getElementName()
   */ public
 int getItemTypeCode() {
    return libsbmlJNI.ListOfCompartmentReferences_getItemTypeCode(swigCPtr, this);
  }

}