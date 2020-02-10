package org.unicam.myGrammar.validation;

@SuppressWarnings("all")
public class ValidatorSupport {
  protected static final String ISSUE_CODE_PREFIX = "org.unicam.myGrammar.";
  
  public static final String OPTIMIZED_STRUCT_FIELDS = (ValidatorSupport.ISSUE_CODE_PREFIX + "optimizeStructFields");
  
  public static final String OPTIMIZE_INTERNAL_FOR = (ValidatorSupport.ISSUE_CODE_PREFIX + "optimizeInternalFor");
  
  public static final String OPTIMIZE_CONTRACT_DECLARATIONS = (ValidatorSupport.ISSUE_CODE_PREFIX + "optimizeContractDeclarations");
}
