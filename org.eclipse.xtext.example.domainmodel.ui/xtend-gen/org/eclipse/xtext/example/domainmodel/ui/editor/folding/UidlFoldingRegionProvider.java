package org.eclipse.xtext.example.domainmodel.ui.editor.folding;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.ui.editor.folding.DefaultFoldingRegionProvider;
import org.eclipse.xtext.xbase.XExpression;

@SuppressWarnings("all")
public class UidlFoldingRegionProvider extends DefaultFoldingRegionProvider {
  @Override
  protected boolean shouldProcessContent(final EObject object) {
    if ((object instanceof XExpression)) {
      return false;
    }
    return true;
  }
}
