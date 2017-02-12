/**
 * Copyright (c) 2017 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.xtext.example.domainmodel.typing;

import java.util.Arrays;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.example.domainmodel.domainmodel.Entity;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.xbase.XAbstractFeatureCall;
import org.eclipse.xtext.xbase.XAssignment;
import org.eclipse.xtext.xbase.XBasicForLoopExpression;
import org.eclipse.xtext.xbase.XBlockExpression;
import org.eclipse.xtext.xbase.XBooleanLiteral;
import org.eclipse.xtext.xbase.XCastedExpression;
import org.eclipse.xtext.xbase.XClosure;
import org.eclipse.xtext.xbase.XConstructorCall;
import org.eclipse.xtext.xbase.XDoWhileExpression;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.XForLoopExpression;
import org.eclipse.xtext.xbase.XIfExpression;
import org.eclipse.xtext.xbase.XInstanceOfExpression;
import org.eclipse.xtext.xbase.XListLiteral;
import org.eclipse.xtext.xbase.XNullLiteral;
import org.eclipse.xtext.xbase.XNumberLiteral;
import org.eclipse.xtext.xbase.XReturnExpression;
import org.eclipse.xtext.xbase.XSetLiteral;
import org.eclipse.xtext.xbase.XStringLiteral;
import org.eclipse.xtext.xbase.XSwitchExpression;
import org.eclipse.xtext.xbase.XSynchronizedExpression;
import org.eclipse.xtext.xbase.XThrowExpression;
import org.eclipse.xtext.xbase.XTryCatchFinallyExpression;
import org.eclipse.xtext.xbase.XTypeLiteral;
import org.eclipse.xtext.xbase.XVariableDeclaration;
import org.eclipse.xtext.xbase.XWhileExpression;
import org.eclipse.xtext.xbase.annotations.typesystem.XbaseWithAnnotationsTypeComputer;
import org.eclipse.xtext.xbase.annotations.xAnnotations.XAnnotation;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.typesystem.computation.ITypeComputationState;

/**
 * @author zhangtiange - Initial contribution and API
 */
@SuppressWarnings("all")
public class DmodelTypeComputer extends XbaseWithAnnotationsTypeComputer {
  @Override
  protected void _computeTypes(final XAbstractFeatureCall expression, final ITypeComputationState state) {
    final Entity e = EcoreUtil2.<Entity>getContainerOfType(expression, Entity.class);
    ICompositeNode _node = NodeModelUtils.getNode(expression);
    final int lineNumber = _node.getStartLine();
    Class<? extends Entity> _class = e.getClass();
    String _name = _class.getName();
    String _plus = ("computeTypes:" + _name);
    String _plus_1 = (_plus + ".");
    String _name_1 = e.getName();
    String _plus_2 = (_plus_1 + _name_1);
    String _plus_3 = (_plus_2 + ".");
    String _plus_4 = (_plus_3 + Integer.valueOf(lineNumber));
    String _plus_5 = (_plus_4 + ".");
    String _concreteSyntaxFeatureName = expression.getConcreteSyntaxFeatureName();
    String _plus_6 = (_plus_5 + _concreteSyntaxFeatureName);
    InputOutput.<String>println(_plus_6);
    super._computeTypes(expression, state);
  }
  
  public void computeTypes(final XExpression expression, final ITypeComputationState state) {
    if (expression instanceof XAssignment) {
      _computeTypes((XAssignment)expression, state);
      return;
    } else if (expression instanceof XDoWhileExpression) {
      _computeTypes((XDoWhileExpression)expression, state);
      return;
    } else if (expression instanceof XListLiteral) {
      _computeTypes((XListLiteral)expression, state);
      return;
    } else if (expression instanceof XSetLiteral) {
      _computeTypes((XSetLiteral)expression, state);
      return;
    } else if (expression instanceof XWhileExpression) {
      _computeTypes((XWhileExpression)expression, state);
      return;
    } else if (expression instanceof XAbstractFeatureCall) {
      _computeTypes((XAbstractFeatureCall)expression, state);
      return;
    } else if (expression instanceof XBasicForLoopExpression) {
      _computeTypes((XBasicForLoopExpression)expression, state);
      return;
    } else if (expression instanceof XBlockExpression) {
      _computeTypes((XBlockExpression)expression, state);
      return;
    } else if (expression instanceof XBooleanLiteral) {
      _computeTypes((XBooleanLiteral)expression, state);
      return;
    } else if (expression instanceof XCastedExpression) {
      _computeTypes((XCastedExpression)expression, state);
      return;
    } else if (expression instanceof XClosure) {
      _computeTypes((XClosure)expression, state);
      return;
    } else if (expression instanceof XConstructorCall) {
      _computeTypes((XConstructorCall)expression, state);
      return;
    } else if (expression instanceof XForLoopExpression) {
      _computeTypes((XForLoopExpression)expression, state);
      return;
    } else if (expression instanceof XIfExpression) {
      _computeTypes((XIfExpression)expression, state);
      return;
    } else if (expression instanceof XInstanceOfExpression) {
      _computeTypes((XInstanceOfExpression)expression, state);
      return;
    } else if (expression instanceof XNullLiteral) {
      _computeTypes((XNullLiteral)expression, state);
      return;
    } else if (expression instanceof XNumberLiteral) {
      _computeTypes((XNumberLiteral)expression, state);
      return;
    } else if (expression instanceof XReturnExpression) {
      _computeTypes((XReturnExpression)expression, state);
      return;
    } else if (expression instanceof XStringLiteral) {
      _computeTypes((XStringLiteral)expression, state);
      return;
    } else if (expression instanceof XSwitchExpression) {
      _computeTypes((XSwitchExpression)expression, state);
      return;
    } else if (expression instanceof XSynchronizedExpression) {
      _computeTypes((XSynchronizedExpression)expression, state);
      return;
    } else if (expression instanceof XThrowExpression) {
      _computeTypes((XThrowExpression)expression, state);
      return;
    } else if (expression instanceof XTryCatchFinallyExpression) {
      _computeTypes((XTryCatchFinallyExpression)expression, state);
      return;
    } else if (expression instanceof XTypeLiteral) {
      _computeTypes((XTypeLiteral)expression, state);
      return;
    } else if (expression instanceof XVariableDeclaration) {
      _computeTypes((XVariableDeclaration)expression, state);
      return;
    } else if (expression instanceof XAnnotation) {
      _computeTypes((XAnnotation)expression, state);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(expression, state).toString());
    }
  }
}
