package net.certware.argument.gsz.diagram.edit.policies;

import java.util.Iterator;

import net.certware.argument.gsz.diagram.edit.commands.GoalStrategiesCreateCommand;
import net.certware.argument.gsz.diagram.edit.commands.GoalStrategiesReorientCommand;
import net.certware.argument.gsz.diagram.edit.commands.StrategyGoalsCreateCommand;
import net.certware.argument.gsz.diagram.edit.commands.StrategyGoalsReorientCommand;
import net.certware.argument.gsz.diagram.edit.commands.StrategyJustificationsCreateCommand;
import net.certware.argument.gsz.diagram.edit.commands.StrategyJustificationsReorientCommand;
import net.certware.argument.gsz.diagram.edit.commands.StrategyStrategyContextsCreateCommand;
import net.certware.argument.gsz.diagram.edit.commands.StrategyStrategyContextsReorientCommand;
import net.certware.argument.gsz.diagram.edit.commands.StrategyStrategySolutionsCreateCommand;
import net.certware.argument.gsz.diagram.edit.commands.StrategyStrategySolutionsReorientCommand;
import net.certware.argument.gsz.diagram.edit.parts.GoalStrategiesEditPart;
import net.certware.argument.gsz.diagram.edit.parts.StrategyGoalsEditPart;
import net.certware.argument.gsz.diagram.edit.parts.StrategyJustificationsEditPart;
import net.certware.argument.gsz.diagram.edit.parts.StrategyStrategyContextsEditPart;
import net.certware.argument.gsz.diagram.edit.parts.StrategyStrategySolutionsEditPart;
import net.certware.argument.gsz.diagram.part.GszVisualIDRegistry;
import net.certware.argument.gsz.diagram.providers.GszElementTypes;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class StrategyItemSemanticEditPolicy extends
		GszBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public StrategyItemSemanticEditPolicy() {
		super(GszElementTypes.Strategy_2008);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		View view = (View) getHost().getModel();
		CompositeTransactionalCommand cmd = new CompositeTransactionalCommand(
				getEditingDomain(), null);
		cmd.setTransactionNestingEnabled(false);
		for (Iterator<?> it = view.getTargetEdges().iterator(); it.hasNext();) {
			Edge incomingLink = (Edge) it.next();
			if (GszVisualIDRegistry.getVisualID(incomingLink) == GoalStrategiesEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
		}
		for (Iterator<?> it = view.getSourceEdges().iterator(); it.hasNext();) {
			Edge outgoingLink = (Edge) it.next();
			if (GszVisualIDRegistry.getVisualID(outgoingLink) == StrategyGoalsEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (GszVisualIDRegistry.getVisualID(outgoingLink) == StrategyJustificationsEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (GszVisualIDRegistry.getVisualID(outgoingLink) == StrategyStrategyContextsEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (GszVisualIDRegistry.getVisualID(outgoingLink) == StrategyStrategySolutionsEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
		}
		EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
		if (annotation == null) {
			// there are indirectly referenced children, need extra commands: false
			addDestroyShortcutsCommand(cmd, view);
			// delete host element
			cmd.add(new DestroyElementCommand(req));
		} else {
			cmd.add(new DeleteCommand(getEditingDomain(), view));
		}
		return getGEFWrapper(cmd.reduce());
	}

	/**
	 * @generated
	 */
	protected Command getCreateRelationshipCommand(CreateRelationshipRequest req) {
		Command command = req.getTarget() == null ? getStartCreateRelationshipCommand(req)
				: getCompleteCreateRelationshipCommand(req);
		return command != null ? command : super
				.getCreateRelationshipCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getStartCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (GszElementTypes.GoalStrategies_4002 == req.getElementType()) {
			return null;
		}
		if (GszElementTypes.StrategyGoals_4006 == req.getElementType()) {
			return getGEFWrapper(new StrategyGoalsCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (GszElementTypes.StrategyJustifications_4007 == req.getElementType()) {
			return getGEFWrapper(new StrategyJustificationsCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (GszElementTypes.StrategyStrategyContexts_4008 == req
				.getElementType()) {
			return getGEFWrapper(new StrategyStrategyContextsCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (GszElementTypes.StrategyStrategySolutions_4009 == req
				.getElementType()) {
			return getGEFWrapper(new StrategyStrategySolutionsCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (GszElementTypes.GoalStrategies_4002 == req.getElementType()) {
			return getGEFWrapper(new GoalStrategiesCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (GszElementTypes.StrategyGoals_4006 == req.getElementType()) {
			return null;
		}
		if (GszElementTypes.StrategyJustifications_4007 == req.getElementType()) {
			return null;
		}
		if (GszElementTypes.StrategyStrategyContexts_4008 == req
				.getElementType()) {
			return null;
		}
		if (GszElementTypes.StrategyStrategySolutions_4009 == req
				.getElementType()) {
			return null;
		}
		return null;
	}

	/**
	 * Returns command to reorient EReference based link. New link target or source
	 * should be the domain model element associated with this node.
	 * 
	 * @generated
	 */
	protected Command getReorientReferenceRelationshipCommand(
			ReorientReferenceRelationshipRequest req) {
		switch (getVisualID(req)) {
		case GoalStrategiesEditPart.VISUAL_ID:
			return getGEFWrapper(new GoalStrategiesReorientCommand(req));
		case StrategyGoalsEditPart.VISUAL_ID:
			return getGEFWrapper(new StrategyGoalsReorientCommand(req));
		case StrategyJustificationsEditPart.VISUAL_ID:
			return getGEFWrapper(new StrategyJustificationsReorientCommand(req));
		case StrategyStrategyContextsEditPart.VISUAL_ID:
			return getGEFWrapper(new StrategyStrategyContextsReorientCommand(
					req));
		case StrategyStrategySolutionsEditPart.VISUAL_ID:
			return getGEFWrapper(new StrategyStrategySolutionsReorientCommand(
					req));
		}
		return super.getReorientReferenceRelationshipCommand(req);
	}

}
