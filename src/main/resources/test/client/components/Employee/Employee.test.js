import { render, screen } from '@testing-library/react';
import Employee from '../../../../client/components/Employee';

test('renders learn react link', () => {
  render(<Employee />);
  const element = screen.getByText(/Starter Kit/i);
  expect(element).toBeTruthy();
});
