/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.sbml.libsbml;

/** 
 * <span class="pkg-marker pkg-color-comp"><a href="group__comp.html">comp</a></span>
 Resolves documents stored on a file system.
 <p>
 * <p style='color: #777; font-style: italic'>
This class of objects is defined by libSBML only and has no direct
equivalent in terms of SBML components.  It is a class used in
the implementation of extra functionality provided by libSBML.
</p>

 <p>
 * In SBML, <em>resolvers</em> come into play with the SBML Level&nbsp;3
 * Hierarchical Model Composition package (&ldquo;comp&rdquo;); this package
 * includes features that allow a model to be composed from pieces that are
 * external to a given SBML document, which implies the need to be able to
 * identify and locate those external pieces.  The identifiers used in
 * &ldquo;comp&rdquo; are URIs (<a target='_blank'
 * href='http://en.wikipedia.org/wiki/Uniform_resource_identifier'>Uniform
 * Resource Identifiers</a>).
 <p>
 * {@link SBMLFileResolver} is a class implementing the ability to resolve URIs to
 * files.  It works on the local file system only.  It can resolve relative
 * and absolute paths, and directories to be searched can be specified using
 * the methods 
 * {@link SBMLFileResolver#addAdditionalDir(String)} and
 * {@link SBMLFileResolver#clearAdditionalDirs()}.
 <p>
 * @see SBMLResolver
 * @see SBMLUri
 */

public class SBMLFileResolver extends SBMLResolver {
   private long swigCPtr;

   protected SBMLFileResolver(long cPtr, boolean cMemoryOwn)
   {
     super(libsbmlJNI.SBMLFileResolver_SWIGUpcast(cPtr), cMemoryOwn);
     swigCPtr = cPtr;
   }

   protected static long getCPtr(SBMLFileResolver obj)
   {
     return (obj == null) ? 0 : obj.swigCPtr;
   }

   protected static long getCPtrAndDisown (SBMLFileResolver obj)
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
        libsbmlJNI.delete_SBMLFileResolver(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  
/**
   * Creates a new {@link SBMLFileResolver} object.
   */ public
 SBMLFileResolver() {
    this(libsbmlJNI.new_SBMLFileResolver__SWIG_0(), true);
  }

  
/**
   * Copy constructor.  Creates a copy of an {@link SBMLFileResolver} object.
   <p>
   * @param c the {@link SBMLFileResolver} object to copy.
   */ public
 SBMLFileResolver(SBMLFileResolver c) {
    this(libsbmlJNI.new_SBMLFileResolver__SWIG_1(SBMLFileResolver.getCPtr(c), c), true);
  }

  
/**
   * Creates and returns a deep copy of this {@link SBMLFileResolver} object.
   <p>
   * @return a (deep) copy of this {@link SBMLFileResolver} object.
   */ public
 SBMLResolver cloneObject() {
    long cPtr = libsbmlJNI.SBMLFileResolver_cloneObject(swigCPtr, this);
    return (cPtr == 0) ? null : new SBMLFileResolver(cPtr, true);
  }

  
/**
   * Resolves the document for the given URI.
   <p>
   * @param uri the URI to the target document.
   * @param baseUri base URI, in case the URI is a relative one.
   <p>
   * @return the document, if this resolver can resolve the document or <code>null.</code>
   */ public
 SBMLDocument resolve(String uri, String baseUri) {
    long cPtr = libsbmlJNI.SBMLFileResolver_resolve__SWIG_0(swigCPtr, this, uri, baseUri);
    return (cPtr == 0) ? null : new SBMLDocument(cPtr, false);
  }

  
/**
   * Resolves the document for the given URI.
   <p>
   * @param uri the URI to the target document.
   * @param baseUri base URI, in case the URI is a relative one.
   <p>
   * @return the document, if this resolver can resolve the document or <code>null.</code>
   */ public
 SBMLDocument resolve(String uri) {
    long cPtr = libsbmlJNI.SBMLFileResolver_resolve__SWIG_1(swigCPtr, this, uri);
    return (cPtr == 0) ? null : new SBMLDocument(cPtr, false);
  }

  
/**
   * Resolves the full URI for a given URI without actually reading the
   * document.
   <p>
   * @param uri the URI to the target document.
   * @param baseUri base URI, in case the URI is a relative one.
   <p>
   * @return the full URI to the document, if this resolver can resolve the
   * document or <code>null.</code>
   */ public
 SBMLUri resolveUri(String uri, String baseUri) {
    long cPtr = libsbmlJNI.SBMLFileResolver_resolveUri__SWIG_0(swigCPtr, this, uri, baseUri);
    return (cPtr == 0) ? null : new SBMLUri(cPtr, false);
  }

  
/**
   * Resolves the full URI for a given URI without actually reading the
   * document.
   <p>
   * @param uri the URI to the target document.
   * @param baseUri base URI, in case the URI is a relative one.
   <p>
   * @return the full URI to the document, if this resolver can resolve the
   * document or <code>null.</code>
   */ public
 SBMLUri resolveUri(String uri) {
    long cPtr = libsbmlJNI.SBMLFileResolver_resolveUri__SWIG_1(swigCPtr, this, uri);
    return (cPtr == 0) ? null : new SBMLUri(cPtr, false);
  }

  
/**
   * Removes the list of directories to search for files to resolve.
   <p>
   * After this method is called, {@link SBMLFileResolver#resolve(String uri, String baseUri)} will only search absolute or relative
   * directories.  New directories can be added using
   * {@link SBMLFileResolver#addAdditionalDir(String)} .
   <p>
   * @see #addAdditionalDir(String)
   */ public
 void clearAdditionalDirs() {
    libsbmlJNI.SBMLFileResolver_clearAdditionalDirs(swigCPtr, this);
  }

  
/**
   * Adds a directory to the list of directories to search for files to
   * resolve.
   <p>
   * @param dir the directory to add.
   <p>
   * @see #clearAdditionalDirs()
   */ public
 void addAdditionalDir(String dir) {
    libsbmlJNI.SBMLFileResolver_addAdditionalDir(swigCPtr, this, dir);
  }

}