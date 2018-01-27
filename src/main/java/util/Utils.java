/*    */ package util;
/*    */ 
/*    */ import org.apache.commons.codec.language.bm.Lang;
/*    */ import org.apache.logging.log4j.LogManager;
/*    */ import org.apache.logging.log4j.Logger;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class Utils
/*    */ {
/*    */   private static Logger logger;
/*    */   private static Lang lang;
/*    */   
/*    */   public static Logger getLogger()
/*    */   {
/* 26 */     if (logger == null) {
/* 27 */       logger = LogManager.getFormatterLogger("wildanimals");
/*    */     }
/* 29 */     return logger;
/*    */   }
/*    */ }
