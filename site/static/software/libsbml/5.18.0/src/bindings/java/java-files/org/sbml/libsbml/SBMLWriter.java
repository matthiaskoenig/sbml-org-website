/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.sbml.libsbml;

/** 
 *  File and text-string SBML writer.
 <p>
 * <p style='color: #777; font-style: italic'>
This class of objects is defined by libSBML only and has no direct
equivalent in terms of SBML components.  This class is not prescribed by
the SBML specifications, although it is used to implement features
defined in SBML.
</p>

 <p>
 * The {@link SBMLWriter} class is the converse of {@link SBMLReader}, and provides the
 * main interface for serializing SBML models into XML and writing the
 * result to an output stream or to files and text strings.  The methods 
 * for writing SBML all take an {@link SBMLDocument} object and a destination.  
 * They return a boolean or integer value to indicate success or failure.
 <p>
 * <h2>Support for writing compressed files</h2>
 <p>
 * LibSBML provides support for writing (as well as reading) compressed
 * SBML files.  The process is transparent to the calling
 * application&mdash;the application does not need to do anything
 * deliberate to invoke the functionality.  If a given SBML filename ends
 * with an extension for the <em>gzip</em>, <em>zip</em> or <em>bzip2</em> compression
 * formats (respectively, <code>&quot;.gz&quot;</code>,
 * <code>&quot;.zip&quot;</code>, or <code>&quot;.bz2&quot;</code>),
 * then the methods
 * {@link SBMLWriter#writeSBML(SBMLDocument, String)}
 * and {@link SBMLReader#readSBML(String)}
 * will automatically compress and decompress the file while writing and
 * reading it.  If the filename has no such extension, it
 * will be written and read uncompressed as normal.
 <p>
 * The compression feature requires that the <em>zlib</em> (for <em>gzip</em> and 
 * <em>zip</em> formats) and/or <em>bzip2</em> (for <em>bzip2</em> format) be available on the
 * system running libSBML, and that libSBML was configured with their
 * support compiled-in.  Please see the libSBML <a href='../../../libsbml-installation.html'>installation instructions</a> for 
 * more information about this.  The methods
 * {@link SBMLWriter#hasZlib()} and
 * {@link SBMLWriter#hasBzip2()}
 * can be used by an application to query at run-time whether support
 * for the compression libraries is available in the present copy of
 * libSBML.
 <p>
 * Support for compression is not mandated by the SBML standard, but
 * applications may find it helpful, particularly when large SBML models
 * are being communicated across data links of limited bandwidth.
 */

public class SBMLWriter {
   private long swigCPtr;
   protected boolean swigCMemOwn;

   protected SBMLWriter(long cPtr, boolean cMemoryOwn)
   {
     swigCMemOwn = cMemoryOwn;
     swigCPtr    = cPtr;
   }

   protected static long getCPtr(SBMLWriter obj)
   {
     return (obj == null) ? 0 : obj.swigCPtr;
   }

   protected static long getCPtrAndDisown (SBMLWriter obj)
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
        libsbmlJNI.delete_SBMLWriter(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  /**
   * Equality comparison method for SBMLWriter.
   * <p>
   * Because the Java methods for libSBML are actually wrappers around code
   * implemented in C++ and C, certain operations will not behave as
   * expected.  Equality comparison is one such case.  An instance of a
   * libSBML object class is actually a <em>proxy object</em>
   * wrapping the real underlying C/C++ object.  The normal <code>==</code>
   * equality operator in Java will <em>only compare the Java proxy objects</em>,
   * not the underlying native object.  The result is almost never what you
   * want in practical situations.  Unfortunately, Java does not provide a
   * way to override <code>==</code>.
   *  <p>
   * The alternative that must be followed is to use the
   * <code>equals()</code> method.  The <code>equals</code> method on this
   * class overrides the default java.lang.Object one, and performs an
   * intelligent comparison of instances of objects of this class.  The
   * result is an assessment of whether two libSBML Java objects are truly 
   * the same underlying native-code objects.
   *  <p>
   * The use of this method in practice is the same as the use of any other
   * Java <code>equals</code> method.  For example,
   * <em>a</em><code>.equals(</code><em>b</em><code>)</code> returns
   * <code>true</code> if <em>a</em> and <em>b</em> are references to the
   * same underlying object.
   *
   * @param sb a reference to an object to which the current object
   * instance will be compared
   *
   * @return <code>true</code> if <code>sb</code> refers to the same underlying 
   * native object as this one, <code>false</code> otherwise
   */
  public boolean equals(Object sb)
  {
    if ( this == sb ) 
    {
      return true;
    }
    return swigCPtr == getCPtr((SBMLWriter)(sb));
  }

  /**
   * Returns a hashcode for this SBMLWriter object.
   *
   * @return a hash code usable by Java methods that need them.
   */
  public int hashCode()
  {
    return (int)(swigCPtr^(swigCPtr>>>32));
  }

  
/**
   * Creates a new {@link SBMLWriter}.
   <p>
   * The libSBML {@link SBMLWriter} objects offer methods for writing SBML in
   * XML form to files and text strings.
   */ public
 SBMLWriter() {
    this(libsbmlJNI.new_SBMLWriter(), true);
  }

  
/**
   * Sets the name of this program, i.e., the program that is about to
   * write out the {@link SBMLDocument}.
   <p>
   * If the program name and version are set (see
   * {@link SBMLWriter#setProgramVersion(String)}), the
   * following XML comment, intended for human consumption, will be written
   * at the beginning of the XML document:
   * <pre class='fragment'>
 &lt;!-- Created by &lt;program name&gt; version &lt;program version&gt;
 on yyyy-MM-dd HH:mm with libSBML version &lt;libsbml version&gt;. --&gt;
 </pre>
   <p>
   * If the program name and version are not set at some point before
   * calling the writeSBML() methods, no such comment is written out.
   <p>
   * @param name the name of this program (where 'this program' refers to
   * program in which libSBML is embedded, not libSBML itself!)
   <p>
   * <p>
 * @return integer value indicating success/failure of the
 * function.   This particular
 * function only does one thing irrespective of user input or 
 * object state, and thus will only return a single value:
   * <ul>
   * <li> {@link libsbmlConstants#LIBSBML_OPERATION_SUCCESS LIBSBML_OPERATION_SUCCESS}
   *
   * </ul> <p>
   * @see #setProgramVersion(String version)
   */ public
 int setProgramName(String name) {
    return libsbmlJNI.SBMLWriter_setProgramName(swigCPtr, this, name);
  }

  
/**
   * Sets the version of this program, i.e., the program that is about to
   * write out the {@link SBMLDocument}.
   <p>
   * If the program version and name are set (see
   * {@link SBMLWriter#setProgramName(String)}), the
   * following XML comment, intended for human consumption, will be written
   * at the beginning of the document:
   * <pre class='fragment'>
 &lt;!-- Created by &lt;program name&gt; version &lt;program version&gt;
 on yyyy-MM-dd HH:mm with libSBML version &lt;libsbml version&gt;. --&gt;
 </pre>
   <p>
   * If the program version and name are not set at some point before
   * calling the writeSBML() methods, no such comment is written out.
   <p>
   * @param version the version of this program (where 'this program'
   * refers to program in which libSBML is embedded, not libSBML itself!)
   <p>
   * <p>
 * @return integer value indicating success/failure of the
 * function.   This particular
 * function only does one thing irrespective of user input or 
 * object state, and thus will only return a single value:
   * <ul>
   * <li> {@link libsbmlConstants#LIBSBML_OPERATION_SUCCESS LIBSBML_OPERATION_SUCCESS}
   *
   * </ul> <p>
   * @see #setProgramName(String name)
   */ public
 int setProgramVersion(String version) {
    return libsbmlJNI.SBMLWriter_setProgramVersion(swigCPtr, this, version);
  }

  
/**
   * Writes the given SBML document to filename.
   <p>
   * If the given filename ends with the suffix <code>&quot;.gz&quot;</code>
(for example, <code>&quot;myfile.xml.gz&quot;</code>), libSBML assumes the
caller wants the file to be written compressed in <em>gzip</em> format.
Similarly, if the given filename ends with <code>&quot;.zip&quot;</code> or
<code>&quot;.bz2&quot;</code>, libSBML assumes the caller wants the file to
be compressed in <em>zip</em> or <em>bzip2</em> format (respectively).
Files whose names lack these suffixes will be written uncompressed.
<em>Special considerations for the zip format</em>: If the given filename
ends with <code>&quot;.zip&quot;</code>, the file placed in the zip archive
will have the suffix <code>&quot;.xml&quot;</code> or
<code>&quot;.sbml&quot;</code>.  For example, the file in the zip archive
will be named <code>&quot;test.xml&quot;</code> if the given filename is
<code>&quot;test.xml.zip&quot;</code> or <code>&quot;test.zip&quot;</code>.
Similarly, the filename in the archive will be
<code>&quot;test.sbml&quot;</code> if the given filename is
<code>&quot;test.sbml.zip&quot;</code>.

   <p>
   * @param d the SBML document to be written.
   <p>
   * @param filename the name or full pathname of the file where the SBML
   * is to be written. 
   <p>
   * @return <code>true</code> on success and <code>false</code> if the filename could not be
   * opened for writing.
   <p>
   * @note To write a gzip/zip file, libSBML needs to be configured and linked with
the <a target="_blank" href="http://www.zlib.net/">zlib</a> library at
compile time.  It also needs to be linked with the <a target="_blank"
href="">bzip2</a> library to write files in <em>bzip2</em> format.  (Both
of these are the default configurations for libSBML.)  Errors about
unreadable files will be logged and this method will return
<code>false</code> if a compressed filename is given and libSBML was
<em>not</em> linked with the corresponding required library.

   <p>
   * @see #setProgramVersion(String version)
   * @see #setProgramName(String name)
   */ public
 boolean writeSBML(SBMLDocument d, String filename) {
    return libsbmlJNI.SBMLWriter_writeSBML__SWIG_0(swigCPtr, this, SBMLDocument.getCPtr(d), d, libsbml.getAbsolutePath(filename));
  }

  
/**
   * Writes the given SBML document to the output stream.
   <p>
   * @param d the SBML document to be written.
   <p>
   * @param stream the stream object where the SBML is to be written.
   <p>
   * @return <code>true</code> on success and <code>false</code> if one of the underlying
   * parser components fail (rare).
   <p>
   * @see #setProgramVersion(String version)
   * @see #setProgramName(String name)
   */ public
 boolean writeSBML(SBMLDocument d, OStream stream) {
    return libsbmlJNI.SBMLWriter_writeSBML__SWIG_1(swigCPtr, this, SBMLDocument.getCPtr(d), d, SWIGTYPE_p_std__ostream.getCPtr(stream.get_ostream()), stream);
  }

  
/** * @internal */ public
 String writeToString(SBMLDocument d) {
    return libsbmlJNI.SBMLWriter_writeToString(swigCPtr, this, SBMLDocument.getCPtr(d), d);
  }

  
/**
   * Writes the given SBML document to filename.
   <p>
   * If the given filename ends with the suffix <code>&quot;.gz&quot;</code>
(for example, <code>&quot;myfile.xml.gz&quot;</code>), libSBML assumes the
caller wants the file to be written compressed in <em>gzip</em> format.
Similarly, if the given filename ends with <code>&quot;.zip&quot;</code> or
<code>&quot;.bz2&quot;</code>, libSBML assumes the caller wants the file to
be compressed in <em>zip</em> or <em>bzip2</em> format (respectively).
Files whose names lack these suffixes will be written uncompressed.
<em>Special considerations for the zip format</em>: If the given filename
ends with <code>&quot;.zip&quot;</code>, the file placed in the zip archive
will have the suffix <code>&quot;.xml&quot;</code> or
<code>&quot;.sbml&quot;</code>.  For example, the file in the zip archive
will be named <code>&quot;test.xml&quot;</code> if the given filename is
<code>&quot;test.xml.zip&quot;</code> or <code>&quot;test.zip&quot;</code>.
Similarly, the filename in the archive will be
<code>&quot;test.sbml&quot;</code> if the given filename is
<code>&quot;test.sbml.zip&quot;</code>.

   <p>
   * @param d the SBML document to be written.
   <p>
   * @param filename the name or full pathname of the file where the SBML
   * is to be written. 
   <p>
   * @return <code>true</code> on success and <code>false</code> if the filename could not be
   * opened for writing.
   <p>
   * @note To write a gzip/zip file, libSBML needs to be configured and linked with
the <a target="_blank" href="http://www.zlib.net/">zlib</a> library at
compile time.  It also needs to be linked with the <a target="_blank"
href="">bzip2</a> library to write files in <em>bzip2</em> format.  (Both
of these are the default configurations for libSBML.)  Errors about
unreadable files will be logged and this method will return
<code>false</code> if a compressed filename is given and libSBML was
<em>not</em> linked with the corresponding required library.

   <p>
   * @see #setProgramVersion(String version)
   * @see #setProgramName(String name)
   */ public
 boolean writeSBMLToFile(SBMLDocument d, String filename) {
    return libsbmlJNI.SBMLWriter_writeSBMLToFile(swigCPtr, this, SBMLDocument.getCPtr(d), d, libsbml.getAbsolutePath(filename));
  }

  
/**
   * Writes the given SBML document to an in-memory string and returns a
   * pointer to it.
   <p>
   * The string is owned by the caller and should be freed (with <code>free</code>())
   * when no longer needed.
   <p>
   * @param d the SBML document to be written.
   <p>
   * @return the string on success and <code>0</code> if one of the underlying parser
   * components fail.
   <p>
   * @see #setProgramVersion(String version)
   * @see #setProgramName(String name)
   */ public
 String writeSBMLToString(SBMLDocument d) {
    return libsbmlJNI.SBMLWriter_writeSBMLToString(swigCPtr, this, SBMLDocument.getCPtr(d), d);
  }

  
/**
   * Predicate returning <code>true</code> if this copy of libSBML has been linked
   * with the <em>zlib</em> library.
   <p>
   * LibSBML supports reading and writing files compressed with either
   * bzip2 or zip/gzip compression.  The facility depends on libSBML having
   * been compiled with the necessary support libraries.  This method
   * allows a calling program to inquire whether that is the case for the
   * copy of libSBML it is using.
   <p>
   * @return <code>true</code> if libSBML is linked with zlib, <code>false</code> otherwise.
   <p>
   * 
   <p>
   * @see SBMLWriter#hasBzip2() 
   */ public
 static boolean hasZlib() {
    return libsbmlJNI.SBMLWriter_hasZlib();
  }

  
/**
   * Predicate returning <code>true</code> if this copy of libSBML has been linked
   * with the <em>bzip2</em> library.
   <p>
   * LibSBML supports reading and writing files compressed with either
   * bzip2 or zip/gzip compression.  The facility depends on libSBML having
   * been compiled with the necessary support libraries.  This method
   * allows a calling program to inquire whether that is the case for the
   * copy of libSBML it is using.
   <p>
   * @return <code>true</code> if libSBML is linked with bzip2, <code>false</code> otherwise.
   <p>
   * 
   <p>
   * @see SBMLWriter#hasZlib() 
   */ public
 static boolean hasBzip2() {
    return libsbmlJNI.SBMLWriter_hasBzip2();
  }

}
