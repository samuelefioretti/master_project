/**
 * generated by Xtext 2.21.0
 */
package org.unicam.myGrammar.optGrammar.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.unicam.myGrammar.optGrammar.Contract;
import org.unicam.myGrammar.optGrammar.ImportDirective;
import org.unicam.myGrammar.optGrammar.Model;
import org.unicam.myGrammar.optGrammar.OptGrammarPackage;
import org.unicam.myGrammar.optGrammar.PragmaDirective;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.unicam.myGrammar.optGrammar.impl.ModelImpl#getPragmaDirective <em>Pragma Directive</em>}</li>
 *   <li>{@link org.unicam.myGrammar.optGrammar.impl.ModelImpl#getImportDirective <em>Import Directive</em>}</li>
 *   <li>{@link org.unicam.myGrammar.optGrammar.impl.ModelImpl#getContract <em>Contract</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModelImpl extends MinimalEObjectImpl.Container implements Model
{
  /**
   * The cached value of the '{@link #getPragmaDirective() <em>Pragma Directive</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPragmaDirective()
   * @generated
   * @ordered
   */
  protected EList<PragmaDirective> pragmaDirective;

  /**
   * The cached value of the '{@link #getImportDirective() <em>Import Directive</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImportDirective()
   * @generated
   * @ordered
   */
  protected EList<ImportDirective> importDirective;

  /**
   * The cached value of the '{@link #getContract() <em>Contract</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getContract()
   * @generated
   * @ordered
   */
  protected EList<Contract> contract;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ModelImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return OptGrammarPackage.Literals.MODEL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<PragmaDirective> getPragmaDirective()
  {
    if (pragmaDirective == null)
    {
      pragmaDirective = new EObjectContainmentEList<PragmaDirective>(PragmaDirective.class, this, OptGrammarPackage.MODEL__PRAGMA_DIRECTIVE);
    }
    return pragmaDirective;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<ImportDirective> getImportDirective()
  {
    if (importDirective == null)
    {
      importDirective = new EObjectContainmentEList<ImportDirective>(ImportDirective.class, this, OptGrammarPackage.MODEL__IMPORT_DIRECTIVE);
    }
    return importDirective;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Contract> getContract()
  {
    if (contract == null)
    {
      contract = new EObjectContainmentEList<Contract>(Contract.class, this, OptGrammarPackage.MODEL__CONTRACT);
    }
    return contract;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case OptGrammarPackage.MODEL__PRAGMA_DIRECTIVE:
        return ((InternalEList<?>)getPragmaDirective()).basicRemove(otherEnd, msgs);
      case OptGrammarPackage.MODEL__IMPORT_DIRECTIVE:
        return ((InternalEList<?>)getImportDirective()).basicRemove(otherEnd, msgs);
      case OptGrammarPackage.MODEL__CONTRACT:
        return ((InternalEList<?>)getContract()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case OptGrammarPackage.MODEL__PRAGMA_DIRECTIVE:
        return getPragmaDirective();
      case OptGrammarPackage.MODEL__IMPORT_DIRECTIVE:
        return getImportDirective();
      case OptGrammarPackage.MODEL__CONTRACT:
        return getContract();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case OptGrammarPackage.MODEL__PRAGMA_DIRECTIVE:
        getPragmaDirective().clear();
        getPragmaDirective().addAll((Collection<? extends PragmaDirective>)newValue);
        return;
      case OptGrammarPackage.MODEL__IMPORT_DIRECTIVE:
        getImportDirective().clear();
        getImportDirective().addAll((Collection<? extends ImportDirective>)newValue);
        return;
      case OptGrammarPackage.MODEL__CONTRACT:
        getContract().clear();
        getContract().addAll((Collection<? extends Contract>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case OptGrammarPackage.MODEL__PRAGMA_DIRECTIVE:
        getPragmaDirective().clear();
        return;
      case OptGrammarPackage.MODEL__IMPORT_DIRECTIVE:
        getImportDirective().clear();
        return;
      case OptGrammarPackage.MODEL__CONTRACT:
        getContract().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case OptGrammarPackage.MODEL__PRAGMA_DIRECTIVE:
        return pragmaDirective != null && !pragmaDirective.isEmpty();
      case OptGrammarPackage.MODEL__IMPORT_DIRECTIVE:
        return importDirective != null && !importDirective.isEmpty();
      case OptGrammarPackage.MODEL__CONTRACT:
        return contract != null && !contract.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ModelImpl