package PieChartNsfAgents;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;

import com.moonshine.domino.crud.GetAllAgentBase;
import com.moonshine.domino.field.FieldDefinition;
import com.moonshine.domino.field.FieldType;
import com.moonshine.domino.security.AllowAllSecurity;
import com.moonshine.domino.security.SecurityInterface;
import com.moonshine.domino.util.DominoUtils;
import com.moonshine.domino.util.ParameterException;

import lotus.domino.*;

public class PieChartNsfRead extends GetAllAgentBase {
	protected View getLookupView() throws NotesException {
		return agentDatabase.getView("PieChartNsf");
	}
	
	protected Collection<FieldDefinition> getFieldList() {
		Collection<FieldDefinition> fields = new ArrayList<FieldDefinition>();
		fields.add(new FieldDefinition("name", FieldType.TEXT, false));
		fields.add(new FieldDefinition("value", FieldType.NUMBER, false));

		return fields;
	}
	
	protected Object getFilterKey() throws ParameterException {
		Collection<FieldDefinition> keys = new ArrayList<FieldDefinition>();


		if (keys.size() <= 0) {
			keys.add(new FieldDefinition(getUniversalIDName(), FieldType.TEXT, false));
		}
		return getKeyOptional(keys);
	}
	
	protected void preprocessDocument(Document doc) {
		return;
	}
	
	
	protected SecurityInterface getSecurity() {
		return new AllowAllSecurity(session);
	}
	
	protected void cleanup()  {
		// nothing to add
	}
	
	
	protected boolean shouldReturnUniversalID() {
		return true;
	}
}