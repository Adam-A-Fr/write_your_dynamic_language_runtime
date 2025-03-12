package fr.umlv.smalljs.jvminterp;

import fr.umlv.smalljs.rt.JSObject;

final class FunClassLoader extends ClassLoader {
  private final FunDictionary dictionary;
  private final JSObject global; 
  
  FunClassLoader(FunDictionary dictionary, JSObject global) {
    this.dictionary = dictionary;
    this.global = global;
  }

  public JSObject global() {
    return global;
  }

  public FunDictionary dictionary() {
    return dictionary;
  }
  
  public Class<?> createClass(String name, byte[] instrs) {
    return defineClass(name, instrs, 0, instrs.length);
  }
}