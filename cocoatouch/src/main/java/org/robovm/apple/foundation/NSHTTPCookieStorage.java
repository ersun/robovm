/*
 * Copyright (C) 2014 Trillian Mobile AB
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.robovm.apple.foundation;

/*<imports>*/
import java.io.*;
import java.nio.*;
import java.util.*;
import org.robovm.objc.*;
import org.robovm.objc.annotation.*;
import org.robovm.objc.block.*;
import org.robovm.rt.*;
import org.robovm.rt.bro.*;
import org.robovm.rt.bro.annotation.*;
import org.robovm.rt.bro.ptr.*;
import org.robovm.apple.corefoundation.*;
import org.robovm.apple.security.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library("Foundation") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NSHTTPCookieStorage/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class NSHTTPCookieStoragePtr extends Ptr<NSHTTPCookieStorage, NSHTTPCookieStoragePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(NSHTTPCookieStorage.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public NSHTTPCookieStorage() {}
    protected NSHTTPCookieStorage(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "cookies")
    public native NSArray<?> cookies();
    @Method(selector = "setCookie:")
    public native void setCookie(NSHTTPCookie cookie);
    @Method(selector = "deleteCookie:")
    public native void deleteCookie$(NSHTTPCookie cookie);
    @Method(selector = "cookiesForURL:")
    public native NSArray<?> cookiesForURL$(NSURL URL);
    @Method(selector = "setCookies:forURL:mainDocumentURL:")
    public native void setCookies$forURL$mainDocumentURL$(NSArray<?> cookies, NSURL URL, NSURL mainDocumentURL);
    @Method(selector = "cookieAcceptPolicy")
    public native NSHTTPCookieAcceptPolicy cookieAcceptPolicy();
    @Method(selector = "setCookieAcceptPolicy:")
    public native void setCookieAcceptPolicy(NSHTTPCookieAcceptPolicy cookieAcceptPolicy);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Method(selector = "sortedCookiesUsingDescriptors:")
    public native NSArray<?> sortedCookiesUsingDescriptors$(NSArray<?> sortOrder);
    @Method(selector = "sharedHTTPCookieStorage")
    public static native NSHTTPCookieStorage sharedHTTPCookieStorage();
    /*</methods>*/
}
