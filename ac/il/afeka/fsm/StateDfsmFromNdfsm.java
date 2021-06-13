package ac.il.afeka.fsm;

import java.io.PrintStream;
import java.util.HashSet;
import java.util.Set;

public class StateDfsmFromNdfsm extends State{
	public Set<State> groupOfStates;
	public int id;

	public StateDfsmFromNdfsm(int id) {
		groupOfStates=new HashSet<State>();
		this.id=id;
	}
	public StateDfsmFromNdfsm() {
		this(-1);// the state not in the machine yet
	}
	public void addToGroup(State state) {
		groupOfStates.add(state);
	}
	public boolean isGroupEmpty() {
		return groupOfStates.isEmpty();
	}
	public Set<State> getGroup() {
		return groupOfStates;
	}
	public void addAllGroup(Set<State> state) {
		groupOfStates.addAll(state);
	}
	public void setId(int id) {
		this.id=id;
	}
	@Override
	public int compareTo(State obj) {
		StateDfsmFromNdfsm other = (StateDfsmFromNdfsm) obj;
		if (groupOfStates.equals(other.groupOfStates))
			return 0;
		return this.id-other.id;
	}

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((groupOfStates == null) ? 0 : groupOfStates.hashCode());
	return result;
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	StateDfsmFromNdfsm other = (StateDfsmFromNdfsm) obj;
	if (groupOfStates == null) {
		if (other.groupOfStates != null)
			return false;
	} else if (!groupOfStates.equals(other.groupOfStates))
		return false;
	return true;
}
@Override
public void prettyPrint(PrintStream out) {
	out.print(id);
}
@Override
public String toString() {
	// TODO Auto-generated method stub
	return "id=" + id;
}

@Override
public String encode() {
	// TODO Auto-generated method stub
	return "" + id;
}
}
