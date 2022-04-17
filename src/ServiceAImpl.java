@Service
public class ServiceAImpl implements ServiceA {

	@Inject
	private ServiceB serviceB;

	@Override // <- added getter to ServiceA interface
	public ServiceB getServiceB() { return serviceB; }

	@Override // <- added setter to ServiceA interface
	public void setServiceB(final ServiceB serviceB) { this.serviceB = serviceB; }


	public String jobA() {
		return "jobA(" + serviceB.jobB() + ")";
	}
}
