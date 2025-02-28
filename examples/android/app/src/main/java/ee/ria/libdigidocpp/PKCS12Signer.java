/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ee.ria.libdigidocpp;

public class PKCS12Signer extends Signer {
  private transient long swigCPtr;

  protected PKCS12Signer(long cPtr, boolean cMemoryOwn) {
    super(digidocJNI.PKCS12Signer_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(PKCS12Signer obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  @SuppressWarnings("deprecation")
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        digidocJNI.delete_PKCS12Signer(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public PKCS12Signer(String path, String pass) {
    this(digidocJNI.new_PKCS12Signer(path, pass), true);
  }

}
