/*
 * Copyright (c) 2014 -2016, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.wso2.developerstudio.datamapper.diagram.part;

import java.util.Collections;
import java.util.List;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.Tool;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.diagram.ui.internal.services.palette.PaletteToolEntry;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeConnectionTool;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.part.DefaultLinkToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultNodeToolEntry;
import org.wso2.developerstudio.datamapper.diagram.edit.parts.DataMapperRootEditPart;
import org.wso2.developerstudio.datamapper.diagram.edit.parts.ElementEditPart;
import org.wso2.developerstudio.datamapper.diagram.edit.parts.InNode2EditPart;
import org.wso2.developerstudio.datamapper.diagram.edit.parts.InNode3EditPart;
import org.wso2.developerstudio.datamapper.diagram.edit.parts.InNodeEditPart;
import org.wso2.developerstudio.datamapper.diagram.edit.parts.InputEditPart;
import org.wso2.developerstudio.datamapper.diagram.edit.parts.OperatorLeftConnectorEditPart;
import org.wso2.developerstudio.datamapper.diagram.edit.parts.OutNode2EditPart;
import org.wso2.developerstudio.datamapper.diagram.edit.parts.OutNodeEditPart;
import org.wso2.developerstudio.datamapper.diagram.edit.parts.OutputEditPart;
import org.wso2.developerstudio.datamapper.diagram.providers.DataMapperElementTypes;

/**
 * @generated
 */
public class DataMapperPaletteFactory {

	public static final int INITIAL_STATE_OPEN = 0, INITIAL_STATE_CLOSED = 1, INITIAL_STATE_PINNED_OPEN = 2;

	/**
	 * @generated NOT
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createDataMapper1Group());
	}

	/**
	 * Creates "org.wso2.developerstudio.datamapper" palette tool group
	 * 
	 * @generated NOT
	 */
	private PaletteContainer createDataMapper1Group() {

		PaletteDrawer paletteContainer = new PaletteDrawer("Operators");

		/*		PaletteGroup paletteContainer = new PaletteGroup(
		 org.wso2.developerstudio.datamapper.diagram.part.Messages.DataMapper1Group_title);*/
		paletteContainer.setId("createDataMapper1Group"); //$NON-NLS-1$
		paletteContainer.add(createDataMapperLink1CreationTool());
		//		paletteContainer.add(createEqual2CreationTool());
		paletteContainer.add(createConcat3CreationTool());
		paletteContainer.add(createSplit4CreationTool());
		//paletteContainer.add(createConstant5CreationTool());
		paletteContainer.add(createLowerCase6CreationTool());
		//paletteContainer.add(createContains7CreationTool());
		paletteContainer.add(createUpperCase8CreationTool());
		paletteContainer.setInitialState(INITIAL_STATE_CLOSED);
		return paletteContainer;
	}

	/**
	 * @generated NOT
	 */
	private ToolEntry createDataMapperLink1CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(Messages.DataMapperLink1CreationTool_title,
				Messages.DataMapperLink1CreationTool_desc,
				Collections.singletonList(DataMapperElementTypes.DataMapperLink_4001));
		entry.setId("createDataMapperLink1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DataMapperElementTypes.getImageDescriptor(DataMapperElementTypes.DataMapperLink_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated NOT
	 */
	private ToolEntry createEqual2CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(Messages.Equal2CreationTool_title, Messages.Equal2CreationTool_desc,
				Collections.singletonList(DataMapperElementTypes.Equal_2005));
		entry.setId("createEqual2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DataMapperElementTypes.getImageDescriptor(DataMapperElementTypes.Equal_2005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated NOT
	 */
	private ToolEntry createConcat3CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(Messages.Concat3CreationTool_title, Messages.Concat3CreationTool_desc,
				Collections.singletonList(DataMapperElementTypes.Concat_2006));
		entry.setId("createConcat3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DataMapperElementTypes.getImageDescriptor(DataMapperElementTypes.Concat_2006));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated NOT
	 */
	private ToolEntry createSplit4CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(Messages.Split4CreationTool_title, Messages.Split4CreationTool_desc,
				Collections.singletonList(DataMapperElementTypes.Split_2007));
		entry.setId("createSplit4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DataMapperElementTypes.getImageDescriptor(DataMapperElementTypes.Split_2007));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated NOT
	 */
	private ToolEntry createConstant5CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(Messages.Constant5CreationTool_title,
				Messages.Constant5CreationTool_desc, Collections.singletonList(DataMapperElementTypes.Constant_2008));
		entry.setId("createConstant5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DataMapperElementTypes.getImageDescriptor(DataMapperElementTypes.Constant_2008));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated NOT
	 */
	private ToolEntry createLowerCase6CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(Messages.LowerCase6CreationTool_title,
				Messages.LowerCase6CreationTool_desc, Collections.singletonList(DataMapperElementTypes.LowerCase_2009));
		entry.setId("createLowerCase6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DataMapperElementTypes.getImageDescriptor(DataMapperElementTypes.LowerCase_2009));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated NOT
	 */
	private ToolEntry createContains7CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(Messages.Contains7CreationTool_title,
				Messages.Contains7CreationTool_desc, Collections.singletonList(DataMapperElementTypes.Contains_2010));
		entry.setId("createContains7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DataMapperElementTypes.getImageDescriptor(DataMapperElementTypes.Contains_2010));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated NOT
	 */
	private ToolEntry createUpperCase8CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(Messages.UpperCase8CreationTool_title,
				Messages.UpperCase8CreationTool_desc, Collections.singletonList(DataMapperElementTypes.UpperCase_2011));
		entry.setId("createUpperCase8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DataMapperElementTypes.getImageDescriptor(DataMapperElementTypes.UpperCase_2011));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated NOT
	 */
	private static class NodeToolEntry extends PaletteToolEntry {

		/**
		 * @generated NOT
		 */
		private final List<IElementType> elementTypes;

		/**
		 * @generated NOT
		 */
		private NodeToolEntry(String title, String description, List<IElementType> elementTypes) {
			super(null, title, null);
			this.setDescription(description);
			this.elementTypes = elementTypes;
		}

		/**
		 * @generated NOT
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeCreationTool(elementTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}

	/**
	 * @generated NOT
	 */
	private static class LinkToolEntry extends ToolEntry {

		/**
		 * @generated NOT
		 */
		private final List<IElementType> relationshipTypes;

		/**
		 * @generated NOT
		 */
		private LinkToolEntry(String title, String description, List<IElementType> relationshipTypes) {
			super(title, description, null, null);
			this.relationshipTypes = relationshipTypes;
		}

		private EditPart getRoot(EditPart editPart) {
			EditPart temp = editPart.getParent();
			while ((!(temp instanceof DataMapperRootEditPart)) && (temp != null)) {
				if (temp instanceof InputEditPart) {
					return temp;
					/*
					 * if (childEditPart instanceof InNodeEditPart) { NodeFigure
					 * figureInput = ((InNodeEditPart) childEditPart)
					 * .getNodeFigureOutput(); figureInput.removeAll(); Figure
					 * emptyFigure = new Figure(); figureInput.add(emptyFigure);
					 * break; } else { NodeFigure figureInput =
					 * ((InNode2EditPart) childEditPart) .getNodeFigureOutput();
					 * figureInput.removeAll(); Figure emptyFigure = new
					 * Figure(); figureInput.add(emptyFigure); break; }
					 */
				} else if (temp instanceof OutputEditPart) {
					return temp;
				}

				temp = temp.getParent();

			}
			return null;
		}

		/**
		 * @generated NOT
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeConnectionTool(relationshipTypes) {

				/*
				 * hacking out/In Node for Element & Attribute to make mapping
				 */

				@Override
				protected Command getCommand() {

					/*
					 * for Element
					 */
					if (getTargetEditPart() instanceof ElementEditPart) {

						for (int i = 0; i < ((ElementEditPart) getTargetEditPart()).getChildren().size(); ++i) {

							if (getRoot(getTargetEditPart()) instanceof OutputEditPart) {

								if (((ElementEditPart) getTargetEditPart()).getChildren().get(i) instanceof InNodeEditPart) {
									return ((EditPart) ((ElementEditPart) getTargetEditPart()).getChildren().get(i))
											.getCommand(getTargetRequest());

								} else if (((ElementEditPart) getTargetEditPart()).getChildren().get(i) instanceof InNode2EditPart) {
									return ((InNode2EditPart) ((ElementEditPart) getTargetEditPart()).getChildren()
											.get(i)).getCommand(getTargetRequest());

								}
							} else if (getRoot(getTargetEditPart()) instanceof InputEditPart) {

								if (((ElementEditPart) getTargetEditPart()).getChildren().get(i) instanceof OutNodeEditPart) {
									return ((OutNodeEditPart) ((ElementEditPart) getTargetEditPart()).getChildren()
											.get(i)).getCommand(getTargetRequest());

								} else if (((ElementEditPart) getTargetEditPart()).getChildren().get(i) instanceof OutNode2EditPart) {
									return ((OutNode2EditPart) ((ElementEditPart) getTargetEditPart()).getChildren()
											.get(i)).getCommand(getTargetRequest());

								}

							}

						}// for
					}// for element mouse enter

					/*
					 * for leftconnector
					 */
					if (getTargetEditPart() instanceof OperatorLeftConnectorEditPart) {
						for (int i = 0; i < ((OperatorLeftConnectorEditPart) getTargetEditPart()).getChildren().size(); ++i) {

							if ((getTargetEditPart()).getChildren().get(i) instanceof InNode3EditPart) {
								return ((EditPart) (getTargetEditPart()).getChildren().get(i))
										.getCommand(getTargetRequest());

							}

						}// for
					}// for leftconnector mouse enter

					return super.getCommand();
				}// get command
			}; // UnspecifiedTypeConnectionTool

			tool.setProperties(getToolProperties());
			return tool;
		}// create tool
	}
}