package org.eclipse.xtext.example.domainmodel.ui.editor.folding

import org.eclipse.xtext.ui.editor.folding.DefaultFoldingRegionProvider
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.xbase.XExpression

class UidlFoldingRegionProvider extends DefaultFoldingRegionProvider{
    
    override protected boolean shouldProcessContent(EObject object) {
        if(object instanceof XExpression)
            return false
        return true
    }
    
}
