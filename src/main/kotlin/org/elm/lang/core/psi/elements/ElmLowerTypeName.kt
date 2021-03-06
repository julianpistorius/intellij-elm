package org.elm.lang.core.psi.elements

import com.intellij.lang.ASTNode
import org.elm.lang.core.psi.ElmNamedElementImpl
import org.elm.lang.core.psi.IdentifierCase


class ElmLowerTypeName(node: ASTNode) : ElmNamedElementImpl(node, IdentifierCase.LOWER)