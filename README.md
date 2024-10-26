## X.509 Certificate-Based Authentication

This branch demonstrates how to configure X.509 certificate-based authentication using Spring Security. X.509 certificates are commonly used for client authentication, adding an extra layer of security by validating a certificate issued by a trusted Certificate Authority (CA).

### Overview

X.509 authentication requires clients to present a valid certificate during the SSL handshake. Spring Security verifies the certificate, and if it’s trusted, grants access to the requested resources. This approach is useful in enterprise environments where client authenticity is paramount for example.

---

### Resources

For further reading on X.509 certificate-based authentication in Spring Security:

- [Spring Security Reference](https://docs.spring.io/spring-security/reference/)
