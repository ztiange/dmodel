/*******************************************************************************
 * Copyright (c) 2017 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.example.domainmodel.typing

import org.eclipse.xtext.nodemodel.util.NodeModelUtils
import org.eclipse.xtext.xbase.XAbstractFeatureCall
import org.eclipse.xtext.xbase.annotations.typesystem.XbaseWithAnnotationsTypeComputer
import org.eclipse.xtext.xbase.typesystem.computation.ITypeComputationState

import static org.eclipse.xtext.EcoreUtil2.*
import org.eclipse.xtext.example.domainmodel.domainmodel.Entity

/**
 * @author zhangtiange - Initial contribution and API
 */
class DmodelTypeComputer extends XbaseWithAnnotationsTypeComputer {
//    override dispatch void computeTypes(XAbstractFeatureCall expression, ITypeComputationState state){
//    	val e = getContainerOfType(expression,Entity)
//    	val lineNumber = NodeModelUtils.getNode(expression).startLine
//    	println("computeTypes:"+e.class.name +'.'+e.name+'.'+lineNumber +'.'+expression.concreteSyntaxFeatureName)
//    	super._computeTypes(expression,state)
//    }
	
}