import java.util.Arrays;
import java.util.List;

import ac.il.afeka.Submission.Submission;
import ac.il.afeka.fsm.DFSM;
import ac.il.afeka.fsm.NDFSM;

public class Main implements Submission, Assignment3 {

	@Override
	public List<String> submittingStudentIds() {
		return Arrays.asList("316552603", "318247822");
	}

	@Override
	public String convert(String ndfsm) throws Exception {
		// TODO return an encoding of a deterministic finite state machines that accepts
		// the same language as ndfsm.
		NDFSM nDfsm=new NDFSM(ndfsm);
		DFSM dfsm=nDfsm.toDFSM();
		return dfsm.encode();
	}
	//the check we had done ---> df.minimize().toCanonicForm().encode().equals(newDf.minimize().toCanonicForm().encode()) 
}
